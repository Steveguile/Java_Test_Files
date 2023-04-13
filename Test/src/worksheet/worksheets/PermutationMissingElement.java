package worksheet.worksheets;

/*
 * Correctness: 100%
 * Performance: 60%
 */

public class PermutationMissingElement {

    public static int solution(int[] A) {
        int n = A.length + 1;
        long sumElements = (n * (1 + n)) / 2; // Sum of all array elements (arithmetic progression)
        long sumArray = 0; // Sum of values in array

        // Add all values in array
        for(int i=0; i<A.length; i++){
            sumArray = sumArray + A[i];
        } 

        long sum = sumElements - sumArray;

        return (int) sum;
    }
}

/*
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * 
 * Your goal is to find that missing element.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A, returns the value of the missing element.
 * 
 * For example, given array A such that:
 * 
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */

