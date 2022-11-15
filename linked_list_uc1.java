package com.linkedlist;
import org.junit.Assert;
import org.junit.Test;

import java.security.Key;

public class linked_list_uc1 {
    @Test
    public void number(){
        Mynode<Integer>  MyFirstNode = new Mynode<>(56);//local variable
        Mynode<Integer>  MySecondNode = new Mynode<>(30);
        Mynode<Integer>  MyThirdNode = new Mynode<>(70);
        MyFirstNode.setNext(MySecondNode);
        MySecondNode.setNext(MyThirdNode);
        Boolean Result = MyFirstNode.getNext().equals(MySecondNode) &&
                MySecondNode.getNext().equals(MyThirdNode);
        Assert.assertTrue(Result);


    }

    public class Mynode<K> {
        private K key;

        public Mynode getNext() {
            return next;
        }

        public void setNext(Mynode next) {
            this.next = next;
        }
        private Mynode next;

        public Mynode(K Key ){
            this.key = Key;
            this.next = null;
        }

    }
}
