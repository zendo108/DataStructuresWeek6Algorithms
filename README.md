# DataStructuresWeek6Algorithms
This is a few algorithm for the class discusion

### Bubble Sort

Like all comparison based sorting techniques, Bubble Sort is based on comparing two keys and rearranging the associated data in order to place the keys in ascending or descending order. Bubble Sort was one of the first sorting methods created. It is also the simplest. Bubble Sort was so named because as you repeatedly scan the array of records making comparisons the lower value keys gradually "bubble" to the start of the array.

- The bubble sort is typically not leveraged as other simple sorts are favored, but it might have some use for small N (N<25) when the array is nearly sorted to begin with
- For large N it very slow
- Asymptotic analysis O(n2) in the worst, but can be O(n) in best case when encountering a nearly sorted array

The bubble sort works by passing sequentially over a list, comparing each value to the one immediately after it. If the first value is greater than the second, their positions are switched. Over a number of passes, at most equal to the number of elements in the list, all of the values drift into their correct positions. Because each pass finds the maximum item and puts it at the end, the portion of the list to be sorted can be reduced at each pass.

### Selection Sort

The selection sort is a sorting algorithm that performs an in-pace comparison sort.

- The selection sort is typically relatively inefficient on large arrays (N > 25) and is generally considered less efficient the insertion sort. It typically does, however, perform better than the bubble sort.
- The selection sort can have reasonable performance for small N (N<25)
- The selection sort can be preferred over other more complicated sorting algorithms when memory is limited.
- This sort is useful because it is very easy to implement
- Asymptotic analysis O(n2) in the worst case

The selection sort algorithm works as follows:

- Find the minimum value in the list
- Swap it with the value in the first position
- Repeat the steps above for the remainder of the list (starting at the second position and advancing each time) Effectively, the list is divided into two parts: the sublist of items already sorted, which is built up from left to right and is found at the beginning, and the sublist of items remaining to be sorted, occupying the remainder of the array.

### Shell Sort 
Shellsort is a simple extension of insertion sort which gains speed by allowing exchanges of elements that are far apart. The idea is to rearrange the array to give it the property that every hth element (starting anywhere) yields a sorted array. Such an array is said to be hsorted. The shell sort is:

- Typically better than all of the O(n2) sorts including selection, insertion, and bubble sort in the average case with large N.
- Asymptotic analysis is O(n) in the best case
- Asymptotic analysis is O(n log2n) in the worst case

### Mergesort

Merge sort algorithm is an optimal sorting algorithm based on divide-and-conquer approach which is an algorithm that takes a larger problem and breaks it into multiple smaller problems that are easier to solve. The mergesort operates as follows:

1. Divide the array to be sorted continuously into two halves.
2. Step 1 is carried on until there is only one element left in the array. This array will thus be a sorted one, since it consists of only one element.
3. Join the two sorted sub arrays into one until there is only one sorted array which is the required result.

The mergesort is:

- Typically a good sort to use with large N.
- Asymptotic analysis is typically O(n log n) in the best case
- Asymptotic analysis is O(n log n) in the worst case

### Quicksort

Quicksort is a sorting algorithm that, on average, makes O(n log n) comparisons to sort n items. This makes quick sort a fast sorting algorithm in the average case.

The quicksort algorithm:

- Typically provides the best average case performance of any general purpose sort when N tends to be large.
- Asymptotic analysis is typically O(n log n) in the best case
- Asymptotic analysis is O(n2) in the worst case

### Heapsort

Heapsort begins by building a heap out of the data set, and then removing the largest item and placing it at the end of the partially sorted array. After removing the largest item, it reconstructs the heap, removes the largest remaining item, and places it in the next open position from the end of the partially sorted array. This is repeated until there are no items left in the heap and the sorted array is full. Elementary implementations require two arrays - one to hold the heap and the other to hold the sorted elements.

During extraction, the only space required is that needed to store the heap. To achieve constant space overhead, the heap is stored in the part of the input array not yet sorted.

Heapsort uses two heap operations: insertion and root deletion. Each extraction places an element in the last empty location of the array. The remaining prefix of the array stores the unsorted elements.

### Radix Sort

Radix sort is an algorithm that sorts numbers by processing individual digits. n numbers consisting of k digits each are sorted in O(n · k) time. Radix sort can either process digits of each number starting from the least significant digit (LSD) or the most significant digit (MSD). The LSD algorithm first sorts the list by the least significant digit while preserving their relative order using a stable sort. Then it sorts them by the next digit, and so on from the least significant to the most significant, ending up with a sorted list. While the LSD radix sort requires the use of a stable sort, the MSD radix sort algorithm does not (unless stable sorting is desired). In-place MSD radix sort is not stable. It is common for the counting sort algorithm to be used internally by the radix sort. Hybrid sorting approach, such as using insertion sort for small bins improves performance of radix sort significantly.

Radixsort:

- Asymptotic analysis is O(Kn) in the worst case
- Asymptotic analysis is O(n2) in the worst case
