package com.interview.java.quicksort.iterative.main;

import com.interview.java.quicksort.iterative.sortinglogic.QuickSortIterative;

public class QuickSortMain {

	public static void main(String[] args) {
		QuickSortIterative objQS= new QuickSortIterative();
		int[] arrToBeSorted = {100, 2, -33,6,9900,54,8,56,7};
		objQS.quickSort(arrToBeSorted, 0, arrToBeSorted.length-1);
		//print sorted array
		for(int i: arrToBeSorted) {
			System.out.println(i);
		}
	}

}
