// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] array = {3, 8, 9, 7, 6};
        int[] result = test.solution(array, 3);
    }

    public int[] solution(int[] A, int K) {
        int[] returnArray = new int[A.length];
        int setIndex = 0;

        // Get shift if K >= N
        if (A.length > 0 && K > A.length) {
            K = (K % A.length);
        }

        for (int i=0; i < A.length; i++) {
            setIndex = i + K;
            if (setIndex >= A.length) {
                setIndex = setIndex - A.length;
            }
            returnArray[setIndex] = A[i];
        }

        return returnArray;
    }
}

