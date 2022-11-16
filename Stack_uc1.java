package stack_and_queue;
import java.util.*;
import java.util.Stack;
import java.util.LinkedList;

public class Stack_uc1 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<Integer> myStack = new Stack<>();

        list.add(30);
        list.add(56);
        list.add(70);
        System.out.println("add elements using linked list :"+list);

        myStack.push(30);
        myStack.push(56);
        myStack.push(70);
        System.out.println(" used push method to add elements using stack :"+myStack);
        System.out.println(""+myStack.peek());
    }

}