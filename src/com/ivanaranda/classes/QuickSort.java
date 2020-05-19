package com.ivanaranda.classes;

public class QuickSort {
	
	int[] arr;
	private int visits = 0;
	private int swaps = 0;
	
	public QuickSort(int[] arr) {
		this.arr = arr;
	}
	public int part(int l,int h) {
		int p = arr[h];
		int i = l, j = h;
		System.out.println("p = "+ p);
		while(i<j) {
			
			while(arr[i]<p) {//looking for a value > pivot
				if(i==arr.length-1) break;
				i++;
				visits++;
			}
			
			
			while(arr[j]>=p) {
				if(j==0) break;
				j--;
				visits++;
			}
			
			if(i<j) {
				System.out.println("swap i and j "+ arr[i] + " and " + arr[j]);
				swap(i,j);
				swaps++;
			}
		}
		
		System.out.println("swap h and i "+ arr[h] + " and " + arr[i]);
		swap(h,i);
		swaps++;
		return i;
	}
	
	public void qsort(int l,int h) {
		if(l<h) {
			int p = part(l,h);// 3
			qsort(l,p-1);// 2
			qsort(p+1,h);
		}
	}
	
	public void swap(int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public String getStats() {
		return "There were " + visits + " visits and " + swaps + " swaps";
	}
}
