package com.linkedlist;

public class insert_uc4 {
    class Node{
        int key;
        Node next;
        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    //Represent the head and tail
    public Node head = null;
    public Node tail = null;

    //insert() will add a new node to the beginning of the list
    public void Insert(int key) {
        //Create a new node
        Node newNode = new Node(key);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //Node temp will point to head
            Node temp = head;
            //newNode will become new head of the list
            head = newNode;
            //Node temp(previous head) will be added after new head
            head.next = temp;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println(" ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.key+ " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        insert_uc4 List = new insert_uc4();

        List.Insert(70);
        List.display();

        List.Insert(30);
        List.display();

        List.Insert(56);
        List.display();


    }
}

