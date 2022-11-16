package com.linkedlist;
import java.util.*;

public class delete_uc5 {

    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<Integer>();

        Stack.add(56);
        Stack.add(30);
        Stack.add(70);


        //Stack = 0->2->5->3->1
        System.out.println("following elements before remove: " + Stack);
        System.out.println("The element removed from the front of Stack: " + Stack.pop());
        System.out.println("Following are the elements in Stack after removing: " + Stack);

    }
}

