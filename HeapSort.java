public class HeapSort {
    //sort 
    public static int[] sort(int[] numbers) {
        //for-loop heapifies the array and turns it into a max heap "tree" and start at the middle of the list
        for (int i = numbers.length / 2 - 1; i >= 0; i--) {
            heapify(numbers, i, numbers.length);
        }

        //for-loop that performs the sort by pushing large values to the end of the list
        //0 is not included because by the time we get there, the list is sorted
        for(int i = numbers.length-1; i > 0; i--) {
            //swap the largest and smallest values
            int tmp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = tmp;

            //reheapify the list
            heapify(numbers, 0, i);  
        }
        return numbers;
    }

    /*
    @param integer representing the parent
    @precond parent integer is non-negative (duh...)
    */
    public static int leftChild(int i)
    {
        return 2 * i + 1;
    }

    //heapify: the resorting of the tree after you remove
    public static void heapify(int[] numbers, int start, int length)
    {
        int child;
        int tmp; //temporary value of parent (this should change if the parent is not the largest value)

        for(tmp = numbers[start]; //start at the value of the parent
            leftChild(start) < length; //the position of the left child of the parent is within bounds
            start = child //update checks further down into the tree
        )
        {
            child = leftChild(start); //child is assigned as the left of the parent

            //1. Check to make sure that the child's index is within bounds of the array
            //2. Compare the child and its sibling and make sure that it is smaller
            if(child != length - 1 && numbers[child] < numbers[child+1])
            {
                child++; //move to check the next child
            }

            //If the parent's current value is smaller than its child
            if (tmp < numbers[child])
            {
                numbers[start] = numbers[child];
            }
            else{
                break; //exit the loop immediately
            }
        }
        numbers[start] = tmp; //the starting parent's value equals the tmp
    }
}