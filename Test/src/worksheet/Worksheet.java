package worksheet;
import java.util.*;

/* 
 */

public class Worksheet {

    public static void main(String args[]) {
        int[] array = {2, 1, 1, 2, 3, 1};
        solution(array);
    }

    public static int solution(int[] A) {

        int maxA = 0; // Max value in A

        for (int value: A) {
            if (value > maxA) {
                maxA = value;
            }
        }

        int[] count = new int[maxA + 1]; // count of each occurence of value from 0 to A[] maxValue

        for (int i = 0; i < A.length; i++) {
            count[A[i]] += 1;
        }

        int uniqueCount = 0;
        for (int value: count) {
            if (value != 0 ) {
                uniqueCount++;
            }
        }

        return uniqueCount;

    }   
}

/*
 * Write a function
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A consisting of N integers, returns the number of distinct values in array A.
 * 
 * For example, given array A consisting of six elements such that:
 * 
 *  A[0] = 2    A[1] = 1    A[2] = 1
 *  A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
