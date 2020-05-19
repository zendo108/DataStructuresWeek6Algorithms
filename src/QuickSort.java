
public class QuickSort {
	/**
	 * Asymptotic analysis of your algorithm. 
	 * --------------------------------------
	 * Quick Sort algorithm has a worst case scenario of O(n^2)
	 * This will happen if in each recursion one of the partitions is empty
	 * then the structure will that that of a simple list.
	 * For example in my implementation I chose to pick the last item as the Pivot
	 * Because I am assuming that the array would be randomly unsorted, in which
	 * case it does not matter where you sample from. Anyways if in this implementation
	 * I get a sorted list then all sub-partitions one of them will be empty.
	 * 
	 * On the other hand the if the data structure of the partitions has the 
	 * structure of a binary tree then the time complexity will be O(nlogn)
	 * So the average time complexity will be Theta(nlogn)
	 * 
	 * 
	 * Description of the assignment and how your algorithm works
	 * ----------------------------------------------------------
	 * This QuickSort Java implementation is commented in every line, explaining 
	 * the inner works of it.
	 * It first take in an array. It has three functions
	 * 
	 * sort(), part(),swap()
	 * 
	 * 
	 * The sort() function takes no arguments, it extracts the low and the high value of the array
	 * and it sends this parameters to an auxiliary function, part() that it does two jobs.
	 * It picks the last item of the partition between low(l) and high(h) and then scans
	 * the partition from l to h (item < pivot) goes to the right of the pivot and (item > pivot)
	 * goes to the left, using the swap() function, then when i which is scanning form left to right
	 * form the beginning is greater than j which is scanning from right to left from the end, the pivot value 
	 * is swapped with the value of arr[i], basically it puts the pivot right between the lower and higher
	 * values.
	 * This class has an overridden sort(l, h) function for the recursive calls.
	 * The idea is that the sort function will call itself with the newly created partition
	 * to do the same operation over and over till l==h meaning the the sections has no more values
	 * 
	 * visits parameter tracks the items that have been visited
	 * 
	 * swaps are the count of swaps in the sorting
	 * 
	 * The getStats() functions puts out the info of the sorting process
	 * it shows the array size, number of visits and swaps.
	 * 
	 */
	
	int[] arr;
	private int visits = 0;
	private int swaps = 0;
	
	int low = 0;//initialization of the lower bound of the array
	int high = 0;//initialization of the higher bound of the array length-1 
	
	public QuickSort(int[] arr) {
		this.arr = arr;
		this.high = arr.length-1;
	}
	public int part(int l,int h) {
		/**
		 * in this function the array is partitioned in two halves
		 * this takes in the start/low l and the end/high h of the whole sections of the array
		 * 
		 */
		int p = arr[h];//p is the pivot of the section of this array, lesser items will be placed to its right and greater to its left
		int i = l, j = h;//i starts from the lowest index and j starts from the last index
		System.out.println("p = "+ p);
		while(i<j) {//this loop will execute as long as i<j
			/**
			 * The two inner while loops look for the values greater and less than the pivot value
			 * both in worst case scenario will go through all the items on each side
			 * meaning the total number of items minus the pivot
			 * so its time complexity will be O(n) for both
			 */
			while(arr[i]<p) {
				/**
				 * 
				 * We are looking for >= to the pivot
				 * The time complexity here in the worst case scenario is n 
				 * in the case that the value is the last one or not found
				 */
				if(i==arr.length-1) break;//exit loop if it reached the end of the array
				i++;//increase i, go to the next item
				visits++;//increment the number of items visited
			}
			
			
			while(arr[j]>=p) {
				/**
				 * 
				 * We are looking for a value < pivot
				 * The time complexity here in the worst case scenario is n 
				 * in the case that the value is the last one or not found
				 */
				if(j==0) break;//exit while loop if beginning of the array
				j--;//decrease j, visit the next item down
				visits++;//increment the number of items visited
			}
			/**
			 * after the two i and j stop searching the values greater/equal 
			 * and less than the pivot, there needs to be a swap
			 */
			
			if(i<j) {
				/**
				 * if i<j then the items are swap to be placed
				 * either left or right of the pivot
				 */
				
				System.out.println("swap i and j "+ arr[i] + " and " + arr[j]);
				swap(i,j);//swap is a time constant O(1)
				swaps++;
			}
		}
		
		System.out.println("swap h and i "+ arr[h] + " and " + arr[i]);
		
		/**
		 * once i>j there is the swap between the pivot and the item marked by i
		 * placing the pivot value in between the lesser and greater values
		 *  
		 */
		swap(h,i);
		swaps++;//increment the number of swaps
		return i;//return i to set as the pivot for next partition
	}
	
	/**
	 * this is the starting sort function.
	 * 
	 */
	public void sort() {
		/**
		 * this is the starting sort function, it extracts the low and high value from the given array
		 * first and last item
		 */
		int l = this.low;
		int h = this.high;
		
		if(l<h) {
			int p = part(l,h);// get the pivot for the current section between l and h
			sort(l,p-1);// sort the lower section between the start of the section and the pivot
			sort(p+1,h);// sort the higher section of the partition from the pivot to the end of the partitions
		}
	}
	
	/**
	 * I used overloading here. This is the sorting function for the subsequent recursive sort calls
	 * 
	 * 
	 * @param l
	 * @param h
	 */
	public void sort(int l, int h) {
		if(l<h) {
			int p = part(l,h);// 3
			sort(l,p-1);// 2
			sort(p+1,h);
		}
	}
	
	/**
	 * swap the array values of two given items with two given indices, a and b in this case
	 * this function has 3 steps and a constant time complexity, O(1)
	 * @param a
	 * @param b
	 */
	public void swap(int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public String getStats() {
		return "Array length " + arr.length + "\nThere were " + visits + " visits and " + swaps + " swaps";
	}
}
