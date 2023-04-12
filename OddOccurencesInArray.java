// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashSet; 

class Solution {
    public static void main(String[] args) {
        int[] array = {9, 3, 9, 3, 9, 7, 9};
        Solution test = new Solution();
        int result = test.solution(array);
    }

    public int solution(int[] A) {

        HashSet<Integer> numbersSet = new HashSet<Integer>();        

        for (int i=0; i < A.length; i++) {
            if (!numbersSet.contains(A[i])){
                numbersSet.add(A[i]); // Store first occurence of number
            } else {
                numbersSet.remove(A[i]); // Remove duplicate so only one we're left with is single
            }   
        }

        return numbersSet.iterator().next();

    }
}
