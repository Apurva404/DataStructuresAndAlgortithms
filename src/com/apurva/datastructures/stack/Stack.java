package com.apurva.datastructures.stack;
import com.apurva.datastructures.constants.Constants;

public class Stack {
    int top;
    char[] data;

    public Stack(char[] dataIn){
        top = -1;
        data = dataIn;
    }

    public void push(char a){
        if(!isFull()){
            top = top+1;
            data[top] = a;
        }
        else{
            System.out.println("The stack is full");
        }

    }

    public char pop(){
        char a = '~';
        if(!isEmpty()){
            a = data[top];
            top = top -1;
        }
        else {
            System.out.println("The stack is empty");
        }
        return a;
    }

    public char peek(){
        return data[top];
    }

    public boolean isFull(){
        if(top == Constants.MAXSIZE)
            return  true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
}
