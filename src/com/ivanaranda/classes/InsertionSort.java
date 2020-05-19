package com.ivanaranda.classes;

	public class InsertionSort {
		int[] arr;
		private int visits = 0;
		private int swaps = 0;
		
	public InsertionSort(int[] arr) {
		this.arr = arr;
	}
	
	public void sort(){
	       for (int i = 1; i < arr.length; i++){//visit of array items
	         int j = i;
	         int B = arr[i];
	         visits++;
	         while ((j > 0) && (arr[j-1] > B)){
	           arr[j] = arr[j-1];
	           j--;
	           swaps++;
	         }
	         arr[j] = B;
	      }
	  }
	
	public String getStats() {
		return "Array length " + arr.length + "\nThere were " + visits + " visits and " + swaps + " swaps";
	}
}
