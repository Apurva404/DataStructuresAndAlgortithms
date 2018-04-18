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

    public void display(){
        if(root != null){

        }
        else{
            System.out.println("The tree is empty");
        }

       // ((10)-20-(30))-40-(50)

    }
}
