
Asymptotic analysis of your algorithm. Your analysis must include the efficiency of your algorithm expressed in Big Oh, Big Omega, or Big Theta notation as appropriate.
	
Asymptotic analysis of your algorithm. 
--------------------------------------
Quick Sort algorithm has a worst case scenario of O(n^2)
This will happen if in each recursion one of the partitions is empty
then the structure will that that of a simple list.
For example in my implementation I chose to pick the last item as the Pivot
Because I am assuming that the array would be randomly unsorted, in which
case it does not matter where you sample from. Anyways if in this implementation
I get a sorted list then all sub-partitions one of them will be empty.

On the other hand the if the data structure of the partitions has the 
structure of a binary tree then the time complexity will be O(nlogn)
So the average time complexity will be Theta(nlogn)


Description of the assignment and how your algorithm works
----------------------------------------------------------
This QuickSort Java implementation is commented in every line, explaining 
the inner works of it.
It first takes in an array. It has three functions

sort(), part(),swap()


The sort() function takes no arguments, it extracts the low and the high value of the array
and it sends this parameters to an auxiliary function, part() that it does two jobs.
It picks the last item of the partition between low(l) and high(h) and then scans
the partition from l to h (item < pivot) goes to the right of the pivot and (item > pivot)
goes to the left, using the swap() function, then when i which is scanning form left to right
form the beginning is greater than j which is scanning from right to left from the end, the pivot value 
is swapped with the value of arr[i], basically it puts the pivot right between the lower and higher
values.
This class has an overridden sort(l, h) function for the recursive calls.
The idea is that the sort function will call itself with the newly created partition
to do the same operation over and over till l==h meaning the the sections has no more values

Visits parameter tracks the items that have been visited

Swaps are the count of swaps in the sorting

The getStats() functions puts out the info of the sorting process
it shows the array size, number of visits and swaps.

This is a much better implementation than the example that implements an insert sort that has a O(n^2) because it has to check every item of the array with the other to make sure it is sorted, and for example if the last item is the smallest, it would have to compare it with and swap it to all of the other items. My implementation of the quick sort will divide the array in sections recursively, cutting down on the number of comparisons and swaps.
This are the results of the example here given against my implementation.

static int[] arr = {23,7,4,5,6,2,10,16,3};

Quick Sort (My implementation)
[2, 3, 4, 5, 6, 7, 10, 16, 23]
Array length 9
There were 26 visits and 7 swaps, swap + visit = 33

Insertion Sort (example given)
[2, 3, 4, 5, 6, 7, 10, 16, 23]
Array length 9
There were 8 visits and 21 swaps, swap + visit = 29



static int[] arr = {12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77};
Quick Sort
[0, 1, 2, 3, 4, 9, 10, 12, 14, 23, 29, 31, 45, 69, 75, 77, 88, 91, 99, 101, 120]
Array length 21
There were 84 visits and 23 swaps, swap + visit = 107

Insertion Sort
[0, 1, 2, 3, 4, 9, 10, 12, 14, 23, 29, 31, 45, 69, 75, 77, 88, 91, 99, 101, 120]
Array length 21
There were 20 visits and 94 swaps, swap + visit = 114


I did not include the 1000 item array here for obvious reasons but you can see it in the source code, but the results are here. My QuickSort implementation sorts the same array with 11,848 visits against 999 visits from the Insertion Sort in the example, each visit is one step.
And my QuickSort did 2,365 swaps vs the 249,634 swaps the Insert had to do to get the same results a little over 10,000% more work considering that swapping in a Insert saves the item value into B visit and then reassigns it to the current value even if it was not swapped and if it is swapped it does one reassignment and one decrementation of j, and here it is evident that the QuickSort strategy is consistently better than the Insertion one.

Quick Sort
Array length 1000
There were 11848 visits and 2365 swaps, swap + visit = 14,213

Insertion Sort
Array length 1000
There were 999 visits and 248635 swaps, swap + visit = 249,634
17 times slower

With 4000 items gets steeper
Array length 4000
There were 58134 visits and 11468 swaps, swap + visit = 69,602

Array length 4000
There were 3999 visits and 4015579 swaps, swap + visit = 4,019,578!!!
Almost 6000% more work compared to QuickSort here.

This is telling me that there is a exponential difference
Quick Sort best case scenario 4000*log2(4000)=47,863.14
Insert Sort best case scenario 40002=16,000,000
In this case with this random array of 4000 items my quicksort did slightly worse than its ideal scenario and the Insert did a lot better that its total worst, but still the difference is expectedly astounding. 69,602 vs 4,019,578 there's no doubt that for large arrays, as seen in this experiment, over 100 items the Quick Sort is increasingly better.
