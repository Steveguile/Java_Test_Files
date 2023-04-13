import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] array = {-1, -3};
        Solution test = new Solution();
        int result = test.solution(array);
    }

    public int solution(int[] A) {
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
            if(set.contains(i) != true) 
                return i; // Missing element foun
        }
        
        // Missing item not found so return smallest as end of array
        return A.length + 1;
    }
}

