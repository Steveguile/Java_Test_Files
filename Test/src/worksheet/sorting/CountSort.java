package worksheet.sorting;

// O(n + k)

public class CountSort {

    public static int[] solution(int[] A, int k) {

        int[] failArray = {};
        int n = A.length;
        int[] count = new int[k + 1];

        for (int i = 0; i < n; i++) {
            // range was put in incorrectly or invalid count index
            if (A[i] > count.length - 1 || A[i] < 0) {
                return failArray;
            }
            count[A[i]] += 1;
        }

        int aLoop = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = count[i]; j > 0; j--) {
                A[aLoop++] = i;
            }
        }
        
        return A;

    }   
}

/* 
 * The idea: First, count the elements in the array of counters (see chapter 2). Next, just iterate
 * through the array of counters in increasing order.
 * Notice that we have to know the range of the sorted values. If all the elements are in the
 * set {0, 1, . . . , k}, then the array used for counting should be of size k + 1. The limitation here
 * may be available memory.
 */
