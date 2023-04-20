package worksheet.worksheets;

import java.util.Arrays;

/* 
 * Correctness: 100%
 * Performance: 100%
 * See https://www.youtube.com/watch?v=HV8tzIiidSw&ab_channel=BogdanKotzev
 */

public class NumberOfDiscIntersections {

    public static void main(String args[]) {
    }

    public static int solution(int[] A) {
        int open = 0, intersects = 0;
        long[] startDisc = new long[A.length];
        long[] endDisc = new long[A.length];

        // Populate start and end discs
        for (int i = 0; i < A.length; i++) {
            startDisc[i] = (long) i - A[i];
            endDisc[i] = (long) i + A[i];
        }

        Arrays.sort(startDisc);
        Arrays.sort(endDisc);

        int j = 0; // for endDisc index
        // Looks like O(N^2) but interior loop is generally insignificant checks
        for (int i = 0; i < A.length; i++) {
            if (startDisc[i] <= endDisc[j]) {
                intersects += open;
                open++;

                if (intersects > 10000000) {
                    return -1; // Hard limit from spec
                }
                
            } else {
                i--; // Keep evaluating i until it meets the condition above, whilst closing open discs
                j++;
                open--;
            }
        }

        // Slow as heck O(N^2)
        // for (int i = 0; i < A.length; i++) {
        //     for (int j = i + 1; j < A.length; j++) {
        //         if ((long) i + A[i] >= (long) j - A[j]) {
        //             intersects++;
        //         }

        //         if (intersects > 10000000) {
        //             return -1; // cap
        //         }
        //     }
        // }

        return intersects;
    }   
}

/*
 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].
 * 
 * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).
 * 
 * The figure below shows discs drawn for N = 6 and A as follows:
 * 
 *   A[0] = 1
 *   A[1] = 5
 *   A[2] = 2
 *   A[3] = 1
 *   A[4] = 4
 *   A[5] = 0
 * 
 * 
 * There are eleven (unordered) pairs of discs that intersect, namely:
 * 
 * discs 1 and 4 intersect, and both intersect with all the other discs;
 * disc 2 also intersects with discs 0 and 3.
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
 * 
 * Given array A shown above, the function should return 11, as explained above.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [0..2,147,483,647].
*/
