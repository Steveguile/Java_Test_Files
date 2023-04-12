
class Solution {
    public static void main(String[] args) {
        int[] array = {};
        Solution test = new Solution();
        int result = test.solution(array);
    }

    public int solution(int[] A) {
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

