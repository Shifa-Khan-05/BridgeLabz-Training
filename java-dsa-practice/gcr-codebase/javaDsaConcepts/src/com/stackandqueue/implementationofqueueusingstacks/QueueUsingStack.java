package com.stackandqueue.implementationofqueueusingstacks;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

    Scanner sc = new Scanner(System.in);
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue() {
        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                break;
            s1.push(n);
        }
    }

    public void dequeue() {

        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int removed = s2.pop();
        System.out.println("Dequeued Element: " + removed);

//        while (!s2.isEmpty()) {
//            s1.push(s2.pop());
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStack q = new QueueUsingStack();
        
       
        while(true) {
        	 System.out.println("Enter your choice");
             System.out.println("1. For enqueue");
             System.out.println("2. For dequeue");
             System.out.println("3. For exit");

        int key =sc.nextInt();
        if(key==0)
        {
          break;
        }
        switch (key) {
		case 1: q.enqueue();
		break;
		case 2: q.dequeue();
		break;
		case 3:
			System.exit(0);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
        }
    }
}
