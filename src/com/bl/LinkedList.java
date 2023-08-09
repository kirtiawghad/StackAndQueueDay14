package com.bl;

public class LinkedList <E>{

    Node<E> head ;

    Node<E> tail ;

    public void add(E data){
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void display() {
        Node<E> temp = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public void append(E data) {
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public E pop() {
        E temp = head.getData();
        head = head.getNext();
        return temp;
    }

    public E popLast() {
        E temp = tail.getData();
        Node<E> secondLast = head;
        while(secondLast.getNext() != tail){
            secondLast = secondLast.getNext();
        }
        secondLast.setNext(null);
        tail = secondLast;
        return temp;
    }

    public Node<E> search(E searchData) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.getData().equals(searchData)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public boolean insertAfter(E searchData, E insertData) {
        if (search(searchData) != null){
            Node<E> nextNode = search(searchData).getNext();
            Node<E> newNode = new Node<>(insertData);
            search(searchData).setNext(newNode);
            newNode.setNext(nextNode);
            return true;
        }
        return false;
    }

    public boolean deleteValue(E searchData) {
        Node<E> deletingNode = search(searchData);
        Node<E> temp = head;
        if(search(searchData) != null) {
            while (temp != null) {
                if (temp.getNext().equals(deletingNode)) {
                    temp.setNext(deletingNode.getNext());
                    deletingNode.setNext(null);
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }
}
