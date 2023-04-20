package worksheet.worksheets;

/* 
 */

public class CountDiv {

    public static int solution(int A, int B, int K) {
        // Take array length 9
        // [1, 1, 1, 1, 1, 1, 1, 1, 1]
        // When K = 3
        // A = 3, B = 9
        // There are 3 indicies divisible by K [0, 0, 1, 0, 0, 1, 0, 0, 1] 
        // A = 6, B = 9
        // There are 2 indicies divisible by K [0, 0, 0, 0, 0, 1, 0, 0, 1]
        // A = 6, B = 8
        // There is 1 indicy divisible by K [0, 0, 0, 0, 0, 1, 0, 0, 0]
        // A = 7, B = 8
        // There are 0 indicies divisible by K [0, 0, 0, 0, 0, 0, 0, 0, 0]

        // We need the total indicies divisible by K up to point B
        // Minus the total indicies divisible by K up to point A
        // Add the total numbers of indicies divisble by K between A and B
    
        // e.g.
        // A = 6, B = 9, K = 3
        // [0, 0, 0, 0, 0, 1, 0, 0, 1] so index A = 5 and B = 8
        // floor(8/5) - floor(5/3) + (5 % 3 == 0 ? 1 : 0)
        // 1 - 1 + 2 = 2

        // Mod calc is if remainder get remainder, else exactly divisble at point A
        return (int) (Math.floor(B/K) - Math.floor(A/K) + (A % K == 0 ? 1 : 0));
    }
}
/*
 * Write a function:
 * 
 * class Solution { public int solution(int A, int B, int K); }
 * 
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 * 
 * { i : A ≤ i ≤ B, i mod K = 0 }
 * 
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 */