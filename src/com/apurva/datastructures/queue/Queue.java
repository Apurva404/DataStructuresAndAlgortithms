package com.apurva.datastructures.queue;

import com.apurva.datastructures.constants.Constants;
import com.apurva.datastructures.singlyLinkedList.SinglyLinkedList;

public class Queue {
    int size;
    SinglyLinkedList list;

    public Queue(){
        list = new SinglyLinkedList();
        size = 0;
    }

    public void display(){
        if(!isEmpty()) {
            list.display();
        }
        else
            System.out.println("The queue is empty");
    }

    public void enqueue(int data){
        if(!isFull()) {
            list.insert(data);
            size++;
        }
        else
            System.out.println("The queue is full already");
    }

    public int dequeue(){
        int data = -1;
        if(!isEmpty()){
            data = list.deleteHead();
        }
        else
            System.out.println("The queue is empty ");
        return  data;
    }

    public int peek(){
        int data = -1;
        if(!isEmpty()){
            data = list.getHeadData();
        }
        else{
            System.out.println("The list is empty");
        }
        return data;
    }

    public boolean isFull(){
        if(size >= Constants.MAXSIZE)
           return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;

    }
}
