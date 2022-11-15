package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class linked_list_adding_uc2 {
    @Test
    public void given3number(){
        linked_list_adding_uc2.Mynode<Integer> MyThirdNode = new linked_list_adding_uc2.Mynode<>(70);//local variable
        linked_list_adding_uc2.Mynode<Integer> MySecondNode = new linked_list_adding_uc2.Mynode<>(30);
        linked_list_adding_uc2.Mynode<Integer> MyFirstNode = new linked_list_adding_uc2.Mynode<>(56);
        linked_list_adding linked_list_adding = new linked_list_adding();
        linked_list_adding.add(MyFirstNode);
        linked_list_adding.add(MySecondNode);
        linked_list_adding.add(MyThirdNode);
        linked_list_adding.PrintMyNode();
        Boolean Result =  linked_list_adding.head.equals(MyThirdNode) &&
                linked_list_adding.head.getNext().equals(MySecondNode) &&
                linked_list_adding.tail.equals(MyFirstNode);
        Assert.assertTrue(Result);
    }

    public class Mynode<K> {
        public K key;
        public Mynode next;

        public Mynode(K Key ){
            this.key = Key;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public Mynode getNext() {
            return next;
        }

        public void setNext(Mynode next) {
            this.next = next;
        }
    }

    public class linked_list_adding {
        private Mynode head;
        private Mynode tail;

        public linked_list_adding() { //constructor
            this.head = null;
            this.tail = null;
        }

        public void add(Mynode newNode) {
            if (this.tail == null){
                this.tail = newNode;
            }
            if (this.head == null){
                this.head = newNode;
            }
            else {
                Mynode temp = this.head;
                this.head = newNode;
                this.head.setNext(temp);
            }
        }

        public void PrintMyNode(){
            StringBuffer MyNode = new StringBuffer("my nodes");
            Mynode temp = head;
            while (temp.getNext() != null){
                MyNode.append(temp.getKey());
                if (! temp.equals(tail))  MyNode.append(" ");
                temp = temp.getNext();
            }
            MyNode.append(temp.getKey());
            System.out.println(MyNode);
        }

    }

}
