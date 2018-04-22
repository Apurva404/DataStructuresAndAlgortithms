package com.apurva.datastructures.tree;

public class BinaryTree {
    private Node root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int data){
        if(root == null){
            root = new Node(data);
        }
        else{
            Node cur = root;
            boolean addToLeft = false, addToRight =false;
            while(true) {
                if (data < cur.getData()) {
                    if(cur.left()!=null)
                        cur = cur.left();
                    else {
                        addToLeft = true;
                        break;
                    }

                }
                else {
                    if (cur.right() != null)
                         cur = cur.right();
                    else {
                        addToRight = true;
                        break;
                    }

                }
            }

            if(addToLeft) {
                Node newNode = new Node(data);
                cur.setLeftChild(newNode);
            } else if(addToRight) {
                Node newNode = new Node(data);
                cur.setRightChild(newNode);
            }
        }
    }

    public void inOrderTraversal(){
        inOrderTraversalRec(this.root);
    }

    private void inOrderTraversalRec(Node n){
        if(n!=null){
            System.out.print("(");
            inOrderTraversalRec(n.left());
            System.out.print(")-");
            System.out.print(n.getData());
            System.out.print("-(");
            inOrderTraversalRec(n.right());
            System.out.print(")");
        }
    }

    public void preOrderTraversal(){
        preOrderTraversalRec(this.root);
    }

    private void preOrderTraversalRec(Node n){
        if(n!=null){
            System.out.print(n.getData()+"->");
            preOrderTraversalRec(n.left());
            preOrderTraversalRec(n.right());
        }
    }
    public void postOrderTraversal(){
        postOrderTraversalRec(this.root);

    }

    private void postOrderTraversalRec(Node n){
        if(n!=null){
            postOrderTraversalRec(n.left());
            postOrderTraversalRec(n.right());
            System.out.print(n.getData()+"->");
        }
    }
}
