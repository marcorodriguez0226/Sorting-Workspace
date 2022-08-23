## INTRODUCTION

The core of this assignment involves no programming. You are to download the java files from the 
canvas module for the sixth week, load them into a project and run them. The files that make up 
the project are the following:

* SortTimes.java
* InsertionSort.java
* MergeSort.java
* QuickSort.java

The program runs these sorting algorithms on three different datasets, of increasing size:

* Sorted ascending array of integers
* Sorted descending array of integers
* Randomized array of integers

The three sorting algorithms are run one after another on arrays of increasing size. Refer 
to the code in method main of SortTimes for a clear, more detailed explanation. Constant 
values are defined to create arrays of sizes that are multiples of 10 from 10 to MAXARRAYSIZE. 
Current default values cause the program to create and sort integer arrays of lengths 10, 100, 
1,000, 10,000, 100,000, 1,000,000. Running the program yourself, you will see that sorting 
arrays of length 1,000,000 takes enough time to try the patience of anyone. Particularly the 
insertion sort, with its Big-O(N2) running time.

## FOR THIS ASSIGNMENT 

Run the program and then answer the following questions:

* Describe how each of the sort algorithms perform on each of the datasets compared to one 
  another.What did you expect to see? How did that compare with the results?
* Describe how the run-time increases as the dataset size increases (telling me that it takes 
  longer as the dataset increases is a guaranteed 0 for this question). Again, is this the 
  expected result? Why might what you expected differ from what was seen?
* Feel free to offer an explanation for the results (bug in the program, nature of randomized 
  data, etc.).
* Include a screenshot or the actual output of the program after you run it
* Treat this as an experiment, not necessarily a programming exercise. 


For programming purposes and to think about further implementations, add Heap Sort to the 
program,and have results displayed in the same format as the other three sorts. You can use the 
java's built in heap or use the one we created in the previous assignment.

## WHAT TO HAND IN

When you are finished, for the written questions, upload a text or MS Word document with your answers.