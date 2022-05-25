package com.company;

public class PersonLinkedList {

    int size =0;
    Node first = null;
    Node end = null;


    public void add(Person p){
        if (first == null){
        Node newNode = new Node(p,null, null);
        first = newNode;
        end = newNode;
        size++;
    }else {
            Node newNode = new Node(p,end, null);
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    public int size(){
        return size;
    }
    public void print(){

        Node current = first;
        while (current!=null){
            System.out.println(current.person);
            current=current.next;
    }
    }
    class Node {
        Person person;
        Node prev;
        Node next;

        public Node(Person person, Node prev, Node next) {
            this.person = person;
            this.prev = prev;
            this.next = next;
        }
    }

}
