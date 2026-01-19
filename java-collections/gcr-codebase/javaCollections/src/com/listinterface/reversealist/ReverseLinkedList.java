package com.listinterface.reversealist;

	import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

	public class ReverseLinkedList {


	    public static void reverseLinkedList(List<Integer> list) {
	        int start = 0;
	        int end = list.size() - 1;

	        while (start < end) {
	            // Swap elements
	            int temp = list.get(start);
	            list.set(start, list.get(end));
	            list.set(end, temp);

	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        List<Integer> list = new LinkedList<>();
	        list.add(1);
	        list.add(4);
	        list.add(6);
	        list.add(9);
	        
           System.out.println(list);
	       reverseLinkedList(list);
	        System.out.println(list);
	    }
	

}
