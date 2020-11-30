package com.interview.java.quicksort.iterative.sortinglogic;

import com.interview.java.quicksort.iterative.partitionlogic.PartitionLogic;

public class QuickSortIterative {

	public void quickSort(int[] arr, int lowIndex, int highIndex) {
		int[] stack = new int[highIndex-lowIndex+1];
		int top=-1;
		
		stack[++top]= lowIndex;
		stack[++top]= highIndex;

		while(top>=0) {
			int h= stack[top--];
			int l= stack[top--];
			
			int p = PartitionLogic.returnPartitionIndex(arr, l, h);
			//If there are at least two values on left of the partition
			if(l<p-1) {
				stack[++top]= l;
				stack[++top]= p-1;
			}
			
			//If there are at least two values on right of the partition
			if(p+1<h) {
				stack[++top]= p+1;
				stack[++top]= h;
			}
		}
	}
}
