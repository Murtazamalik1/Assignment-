package com.linkedlist;
import java.util.*;
import java.util.LinkedList;

public class Remove_Last_Elements_uc6 {
    public static void main(String args[])

    {

        // Creating an empty LinkedList

        LinkedList<Integer> list = new LinkedList<Integer>();

        // Use add() method to add elements in the list

        list.add(56);

        list.add(30);

        list.add(70);


        // Displaying the list

        System.out.println("LinkedList:" + list);


        // Remove the tail using removeLast()

        System.out.println("The last element is removed: " + list.removeLast());



        // Displaying the final list

        System.out.println("After Remove LinkedList:" + list);



        // Remove the tail using removeLast()

    }
}

