package worksheet.worksheets;
import java.util.*;

/*
 * Correctness: 100%
 * Performance: 100%
 */

public class MissingInteger {

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        
        // Empty array means smallest is 1
        if (A.length == 0) {
            return 1;
        }

        // add values from A to set
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        
        for (int i = 1; i <= A.length; i++) {
            if(!set.contains(i)) 
                return i; // Missing element foun
        }
        
        // Missing item not found so return smallest as end of array
        return A.length + 1;
    }
}

/*
 * This is a demo task.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * 
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * 
 * Given A = [1, 2, 3], the function should return 4.
 * 
 * Given A = [−1, −3], the function should return 1.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
