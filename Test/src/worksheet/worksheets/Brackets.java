package worksheet.worksheets;

import java.util.LinkedList;

/* 
 * Correctness: 100%
 * Performance: 100%
 */

public class Brackets {

    public static void main(String args[]) {
    }

    public static final int lPAREN = (int) '('; // 40
    public static final int rPAREN = (int) ')'; // 41
    public static final int lBRACK = (int) '['; // 91
    public static final int rBRACK = (int) ']'; // 93
    public static final int lBRACE = (int) '{'; // 123
    public static final int rBRACE = (int) '}'; // 125

    public static int solution(String S) {

        if (S.isEmpty()) {
            return 1; // Empty arrays are 
        }

        if (!S.matches("^[({\\[\\]})]+$")) {
            return 0; // Invalid characters
        }

        if (S.length() % 2 != 0) {
            return 0; // Can't be nested if uneven
        }

        char[] charS = S.toCharArray();
        LinkedList<Integer> stack = new LinkedList<Integer>(); 
        int pushVal = 0;

        for (int i = 0; i < charS.length; i++) {
            if (stack.size() > 0 && isOpposite((int) charS[i], stack.getFirst())) {
                stack.pop();
            } else {
                // Should never push a right sided nest, it won't be correctly nested
                pushVal = (int) charS[i];
                if (isRight(pushVal)) return 0;
                stack.push(pushVal);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }   

    public static boolean isOpposite(int left, int right) {

        switch (left) {
            case lBRACE:
                if (right == rBRACE) return true;
                break;
            case lBRACK:
                if (right == rBRACK) return true;
                break;
            case lPAREN:
                if (right == rPAREN) return true;
                break;
            case rBRACE:
                if (right == lBRACE) return true;
                break;
            case rBRACK:
                if (right == lBRACK) return true;
                break;
            case rPAREN:
                if (right == lPAREN) return true;
                break;
        }

        return false;
    }

    public static boolean isRight(int character) {
        
        switch (character) {
            case rBRACE:
                return true;
            case rBRACK:
                return true;
            case rPAREN:
                return true;
        }

        return false;
    }

}

/*
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 * 
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(String S); }
 * 
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 * 
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [0..200,000];
 * string S is made only of the following characters: '(', '{', '[', ']', '}' and/or ')'.
*/
