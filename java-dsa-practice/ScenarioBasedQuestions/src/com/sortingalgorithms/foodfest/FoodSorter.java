package com.sortingalgorithms.foodfest;

public class FoodSorter {

	    // Public method to start merge sort
	    public static void mergeSort(Stall[] stalls, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            // Sort left half
	            mergeSort(stalls, left, mid);

	            // Sort right half
	            mergeSort(stalls, mid + 1, right);

	            // Merge both halves
	            merge(stalls, left, mid, right);
	        }
	    }

	    // Merge two sorted subarrays
	    private static void merge(Stall[] stalls, int left, int mid, int right) {

	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        // Temporary arrays
	        Stall[] leftArray = new Stall[n1];
	        Stall[] rightArray = new Stall[n2];

	        // Copy data
	        for (int i = 0; i < n1; i++)
	            leftArray[i] = stalls[left + i];

	        for (int j = 0; j < n2; j++)
	            rightArray[j] = stalls[mid + 1 + j];

	        int i = 0, j = 0, k = left;

	        // Merge while maintaining stability
	        while (i < n1 && j < n2) {
	            if (leftArray[i].getFootfall() <= rightArray[j].getFootfall()) {
	                stalls[k] = leftArray[i];
	                i++;
	            } else {
	                stalls[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements
	        while (i < n1) {
	            stalls[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            stalls[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }
	}
