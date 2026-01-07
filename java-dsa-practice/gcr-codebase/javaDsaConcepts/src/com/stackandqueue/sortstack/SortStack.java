package com.stackandqueue.sortstack;
import java.util.Stack;
public class SortStack {
	
   static void sortStack(Stack<Integer> stack) {

	        if (!stack.isEmpty()) {
	            int top = stack.pop();
	            sortStack(stack);
	            insertSorted(stack, top);
	        }
	    }

	    static void insertSorted(Stack<Integer> stack, int value) {

	        if (stack.isEmpty() || stack.peek() <= value) {
	            stack.push(value);
	            return;
	        }

	        int top = stack.pop();
	        insertSorted(stack, value);
	        stack.push(top);
	    }

	    public static void main(String[] args) {

	        Stack<Integer> stack = new Stack<>();

	        stack.push(30);
	        stack.push(10);
	        stack.push(50);
	        stack.push(20);
	        stack.push(40);

	        System.out.println("Before Sorting: " + stack);

	        sortStack(stack);

	        System.out.println("After Sorting: " + stack);
	    }
	

}
