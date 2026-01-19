package com.sortingalgorithms.eduresults;
	import java.util.*;

	class MergeSortRank {

	    public static void mergeSort(List<Student> list) {
	        if (list.size() <= 1)
	            return;

	        int mid = list.size() / 2;

	        List<Student> left = new ArrayList<>(list.subList(0, mid));
	        List<Student> right = new ArrayList<>(list.subList(mid, list.size()));

	        mergeSort(left);
	        mergeSort(right);

	        merge(list, left, right);
	    }

	    private static void merge(List<Student> result,
	                              List<Student> left,
	                              List<Student> right) {

	        int i = 0, j = 0, k = 0;

	        while (i < left.size() && j < right.size()) {

	            // Stable sorting: <= keeps left order for equal marks
	            if (left.get(i).marks >= right.get(j).marks) {
	                result.set(k++, left.get(i++));
	            } else {
	                result.set(k++, right.get(j++));
	            }
	        }

	        while (i < left.size()) {
	            result.set(k++, left.get(i++));
	        }

	        while (j < right.size()) {
	            result.set(k++, right.get(j++));
	        }
	    }
	

}
