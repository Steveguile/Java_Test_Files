package worksheet.worksheets;

/* 
 * Correctness: 100%
 * Performance: 100%
 */

public class Dominator {

    public static void main(String args[]) {
    }

    public static int solution(int[] A) {
        
        int n = A.length;
        int stackSize = 0;
        int candidate = 0;

        for (int i = 0; i < n; i++) {
            if (stackSize == 0) {
                stackSize++;
                candidate = A[i];
            } else {
                if (candidate != A[i]) {
                    stackSize--;
                } else {
                    stackSize++;
                }
            }
        }

        // Final elements didn't match and reduced stack down to zero 
        // meaning n/2 of same number didn't exist (or stackSize would be (n/2)+ x exceeding)
        if (stackSize == 0) {
            return -1;
        }

        // Count candidate 
        int count = 0;
        int firstPos = -1; // First position of candidate
        for (int i = 0; i < n; i++) {            
            if (A[i] == candidate) {
                if (firstPos == -1) firstPos = i;
                count++;
            }
        }

        // Candidate was the Dominator
        if (count > n / 2) {
            return firstPos;
        }

        return -1;
    }   

}

/*
 * An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
 * 
 * For example, consider array A such that
 * 
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 * 
 * Write a function
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
 * 
 * For example, given array A such that
 * 
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * the function may return 0, 2, 4, 6 or 7, as explained above.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
*/