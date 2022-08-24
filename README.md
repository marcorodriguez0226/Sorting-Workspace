## INTRODUCTION

The core of this assignment involves no programming. You are to download the java files from the canvas module for the sixth week, load them into a project and run them. The files that make up the project are the following:

* SortTimes.java
* InsertionSort.java
* MergeSort.java
* QuickSort.java

The program runs these sorting algorithms on three different datasets, of increasing size:

* Sorted ascending array of integers
* Sorted descending array of integers
* Randomized array of integers

The three sorting algorithms are run one after another on arrays of increasing size. Refer to the code in method main of SortTimes for a clear, more detailed explanation. Constant values are defined to create arrays of sizes that are multiples of 10 from 10 to MAXARRAYSIZE.Current default values cause the program to create and sort integer arrays of lengths 10, 100, 1,000, 10000, 100,000, 1,000,000. Running the program yourself, you will see that sorting arrays of length 1,000,000 takes enough time to try the patience of anyone. Particularly the insertion sort, with its Big-O(N2) running time.

## FOR THIS ASSIGNMENT 

Run the program and then answer the following questions:

* Describe how each of the sort algorithms perform on each of the datasets compared to one another. What did you expect to see? How did that compare with the results?

QuickSort: I would have thought that ascending and decending sorts would have had around the same runtime, while random would have taken the longeest because if you are using the midpoints of the array for a pivot, decending and ascending are going to have a similar pivot point. Therefore, you would be the least likely to pick an extreme such as the lowest and highest number. When you pick a random number, you could possibly pick the highest or lowest number in the array would cause the worst case runtime, which is O(n^2). Also, the size of the data set does impact the data runtime - the larger the data set, the lower the chance of picking either extrema. In reality, random was the fastest, followed by ascending, then decending. I was not expecting that until I read how the program was written and it made it so that you are checking for the numbers before the midpint first, which causes ascending to be faster than decennding. Comparing the different data set sizes, from 10 to a million, small arrays are really bad. Therefor overall, ascending would be fastest bcause you won't be picking either extreme.

InsertionSort: I would have thought that for insertion sort, the smaller the list, the faster it will take to compute and sort all of the numbers in the array. However, when I ran the program, the runtime for size 10 array is slower than a size of 10. I would have thought that it would always be increasing. Also, the larger the list, ascending sort becomes the fastest algorithm, while random is second best, and descending is the slowest. The worst case scenario is when the array list is decreasing because in descending order you have to do the most comparisons. Overall, is better than descending order, which is the worst case because you have to make comparisons with all of the elements in the array. With random, there is almost no chance of getting it in decending order. 

MergeSort: I would have thought whether it was in ascending, descending, or random order, choosing the midpoint cuts the list in half and sorts each side. Therefore, the runtimes within each size should be similar. When I ran the program, the runtimes were fastest for randomly sorted arrays. Also, the output turned out so that ascending and descending were closer together compared to random sort. I would have thought that the runtimes would all be the same inside each array size group. 

Overall, I think that merge sort ran the fastest and a randomized dataset gets the fastest output, size wise. But, as you get a larger amount of elemennts in the 10,000s, then the fastest is descending or ascending order no matter what sorting algorithm you use.

* Describe how the run-time increases as the dataset size increases (telling me that it takes longer as the dataset increases is a guaranteed 0 for this question). Again, is this the expected result? Why might what you expected differ from what was seen?

 With more elements in quick sort, you have to do more comparisons with the pivot. Pciking the pivot isn't hard because you are picking the middle. So then, the array won't be very lopsides where you have to compare everything on one side, and almost nothing on the other side. Decending order is fastest, according to the outputs. Quick sort's worst case scenario is O(n^2). Insertion sort's worst case scenario is O(n^2) but it is slower than quick sort. Merge sort is O(nlogn) and so is heap sort. But, overall, merge sort has the best runtime, if you have a lot of elements in your array (so long as you meet the threshold) and insertion sort would be the slowest as you have a lot of elements to compare and it will take a lot of time if you have an array with a size in the millions. 

* Feel free to offer an explanation for the results (bug in the program, nature of randomized data, etc.).

In the Insertion sort, it will always have the worst runtime in decending order because sorted lists work from least to greatest. Since you are using a\ descending list, you will always have to make a lot of swaps, compared to an ascending or randomly sorted list. If you have am ascending list, you won't have to make any swaps because the list is already sorted. In the merge sort algorithm, the lists are always divided in half and sorted that way. Also, some of the algorithsm they have they have threshholds they have to meet to work efficiently. For example, for very small arrays (n <=20), quicksort does not perform well as insertion sort. The solution is not to use quicksort recursively for small arrays and instead use insertion. 
 

* Include a screenshot or the actual output of the program after you run it
* Treat this as an experiment, not necessarily a programming exercise. 

## OPTIONAL

For programming purposes and to think about further implementations, add Heap Sort to the program,and have results displayed in the same format as the other three sorts. You can use the java's built in heap or use the one we created in the previous assignment.

HeapSort: Since Heap Sort uses a maxheap, I predict that it will be fastest in descending order because all of the large numbers are on top and the smallest will be on bottom. It will be take less time than insertion sort because we will not have to do any comparisons. Merge sort will probably be better, just because heapify will have to do swaps, while merge sort it cuts the array in half and sorts both of them, and reconnects them together. Heap sort will take less time compared to quicksort. In a tier sort, from best to worst, it will be merge sort, heap sort, quick sort, and finally inssertion sort. 

## WHAT TO HAND IN

When you are finished, for the written questions, upload a text or MS Word document with your answers.