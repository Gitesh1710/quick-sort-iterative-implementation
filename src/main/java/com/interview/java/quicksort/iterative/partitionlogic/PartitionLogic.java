package com.interview.java.quicksort.iterative.partitionlogic;

public class PartitionLogic {
	public static int returnPartitionIndex(int[] arr, int lowIndex, int highIndex) {
		int partitionIndex=lowIndex-1; //Initialization of partition index currently pointing to no element in array
		int pivot = arr[highIndex];
		for(int i = lowIndex; i< highIndex; i++) {
			//If current element in the array is <=pivot, it will be moved to left of the partition index and partition index will be incremented by 1
			if(arr[i]<=pivot) {
				partitionIndex++;
				swap(arr, i, partitionIndex);
			}
		}
		
		//At the end of the loop, swap pivot value with partitionIndex+1. Now values on left are bigger and right are smaller than pivot value at partition index
		swap(arr, ++partitionIndex, highIndex);
		
		return partitionIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
