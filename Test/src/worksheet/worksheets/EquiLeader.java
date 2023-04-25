package worksheet.worksheets;

/* 
 * Correctness: 100%
 * Performance: 100%
 */

public class EquiLeader {

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
            return 0;
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

        // Candidate wasn't the leader so no equileaders
        if (count <= n / 2) {
            return 0;
        }

        int EqL = 0; // Count of EquiLeaders
        int leftCount = 0; // Count of leaders found on left side of equicount
        for (int i = 0; i < n; i++) {
            if (A[i] == candidate) { leftCount++; }
            // See explanation for this https://www.youtube.com/watch?v=CZHukXHrFu4&ab_channel=CodeTrading
            // Left side of && is looking for leader's weve seen as part 1 of EquiLeader
            // Right side of && is looking at remainder of leaders on right side
            if (i + 1 < 2 * leftCount && n - i - 1 < 2 * (count - leftCount)) { EqL++; }
        }

        return EqL;
    }   

}

/*
 * A non-empty array A consisting of N integers is given.
 * 
 * The leader of this array is the value that occurs in more than half of the elements of A.
 * 
 * An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.
 * 
 * For example, given array A such that:
 * 
 *     A[0] = 4
 *     A[1] = 3
 *     A[2] = 4
 *     A[3] = 4
 *     A[4] = 4
 *     A[5] = 2
 * we can find two equi leaders:
 * 
 * 0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
 * 2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.
 * The goal is to count the number of equi leaders.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a non-empty array A consisting of N integers, returns the number of equi leaders.
 * 
 * For example, given:
 * 
 *     A[0] = 4
 *     A[1] = 3
 *     A[2] = 4
 *     A[3] = 4
 *     A[4] = 4
 *     A[5] = 2
 * the function should return 2, as explained above.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
*/