package com.apurva.datastructures;

public class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode (int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return  this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public void display(){
        if(this != null){
            SinglyLinkedListNode n = this;
            do{
                System.out.print(n.data);
                if(n.next!=null)
                    System.out.print("->");
                n = n.next;
            }while(n != null);

        }
        else{
            System.out.println("The linked list is empty");
        }
    }

    public void insert(int data){ //adds a new node to the end of list
        if(this!=null){
            SinglyLinkedListNode n = this;
            while(n.next!= null){
                n = n.next;
            }
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.setData(data);
            newNode.next = null;
            n.next = newNode;

        }
        else{
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.setData(data);
            newNode.next = null;
        }
    }

    public void insertToBeginning(SinglyLinkedListNode newNode){ //adds a new node to the beginning of list
        if(this!=null){
            SinglyLinkedListNode n = this;
            newNode.next = n;
        }
        else{
            newNode.next = null;
        }
    }

    public SinglyLinkedListNode delete(int data){
        SinglyLinkedListNode firstNode = this;
        if(this != null){
            if(this.data ==data) {
                firstNode = this.next;
                this.next = null;
            }
            else{
                SinglyLinkedListNode n = this;
                while(n.next.next!= null ){
                    if(n.next.data!= data){
                        n=n.next;
                    }
                    else {
                        n.next = n.next.next;
                    }
                }

            }
        }
        return firstNode;

    }

    public void search(int data){
        int position = -1;
        if(this!=null){
            SinglyLinkedListNode n = this;
            while(n!=null){
                if(n.data != data){
                    n= n.next;
                    position++;
                }
                else{
                    position++;
                    System.out.println("The data is an element of the linked list at position:" +position);
                    break;
                }

            }
        }
        else
            System.out.println("The linked list is empty");
    }

    public void reverse(SinglyLinkedListNode firstNode){



    }

}
