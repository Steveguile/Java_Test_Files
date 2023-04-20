package worksheet.worksheets;

/* 
 * Correctness: 100%
 * Performance: 100%
 */

public class MaxProductOfThree {
    
    public static int solution(int[] A) {
        int k = 2001, kOffset = 1000; // We know k is range [-1000..1000]
        int[] count = new int[k + 1]; // count of each integer that exists 

        if (A.length < 3) {
            return 0; // Cannot make a triplet
        }
        
        // Populate count of values in A 
        for (int i = 0; i < A.length; i++) {
            count[A[i] + kOffset] += 1;
        }

        // Sort 
        int aLoop = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = count[i]; j > 0; j--) {
                A[aLoop++] = i - kOffset;
            }
        }

        int n = A.length - 1;
        int prodLarg = A[n] * A[n - 1] * A[n - 2]; // All largest
        int prodSmal = A[0] * A[1] * A[2]; // Smallest (array may be 2 negatives and rest positive)
        int prodFAndLs = A[0] * A[n] * A[n - 1]; // Smallest and 2 largest
        int prodLAndFs = A[n] * A[0] * A[1]; // Largest and 2 smallest (double negative)

        int max1 = 0, max2 = 0;

        max1 = Math.max(prodLarg, prodSmal);
        max2 = Math.max(prodFAndLs, prodLAndFs);

        return Math.max(max1, max2);
    }   
}

/*
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 * 
 * For example, array A such that:
 * 
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 * contains the following example triplets:
 * 
 * (0, 1, 2), product is −3 * 1 * 2 = −6
 * (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60
 * Your goal is to find the maximal product of any triplet.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a non-empty array A, returns the value of the maximal product of any triplet.
 * 
 * For example, given array A such that:
 * 
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
*/
