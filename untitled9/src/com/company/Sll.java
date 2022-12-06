package com.company;

public class Sll {

    private Node first;
    private Node last;

    public Sll() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){

        return first==null;
    }

    public void insertfirst(int data) {

        Node newnode = new Node();
        newnode.data = data;
        if(isEmpty()){
         last=newnode;
        }
        newnode.next = first;
        first = newnode;
        last.next=first;



    }
    public void displaylist()
    {
        Node current = first;
        while(true){
            current.displaynode();
            current=current.next;
            if(current==last){

                if (last==last.next)
                    break;
                System.out.println("--->"+last.data);
                if(last.next==first){
                    break;
                }
            }


        }

    }
    public void insertlast(int data) {

        Node newnode = new Node();
        newnode.data = data;
        if(isEmpty()){
            first=newnode;
            newnode.next=first;
        }
       last.next=newnode;
        newnode.next=first;
        last=newnode;



    }
    public Node deletefirst(){

        Node current = first;
        first=first.next;
        last.next=first;


        return current;
    }
    public Node deletelast(){
        Node current = first;
        Node prev=null;

        while (current.next.next!=last.next){
            current=current.next;
        }

        last=current;
        last.next=first;
        
        return current;
    }
}





