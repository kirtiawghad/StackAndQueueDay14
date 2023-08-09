package com.bl;

public class Queue <E>{
    LinkedList<E> linkedList1 = new LinkedList<>();

    public Queue() {
    }

    public Queue(LinkedList<E> linkedList1) {
        this.linkedList1 = linkedList1;
    }

    public void enqueue(E data){
        linkedList1.append(data);
    }

    public void printQueue(){
        linkedList1.display();
    }

    public static void main(String[] args) {

        Queue<Integer> queue1 = new Queue<>();
        queue1.enqueue(56);
        queue1.enqueue(30);
        queue1.enqueue(70);
        queue1.printQueue();
        System.out.println();

    }
}
