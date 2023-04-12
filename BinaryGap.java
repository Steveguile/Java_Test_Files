// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        int result = test.solution(1049);
    }

    public int solution(int N) {
        int biggestGap = 0;

        int currentGap = 0;
        char on = '1';

        String binary = Integer.toBinaryString(N);
        // 10000011001
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == on) {
                if (currentGap > biggestGap) {
                    biggestGap = currentGap;
                }
                currentGap = 0;
            } else { // 0 (off)
                currentGap++;
            }
        }

        return biggestGap;
    }
}

/ you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();
        int result = test.solution(1049);
    }
}

class Solution {
    public int solution(int N) {
        int biggestGap = 0;
        int currentGap = 0;
        int on = 1;

        String binary = Integer.toBinaryString(N);
        // 10000011001
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == on) {
                if (currentGap > biggestGap) {
                    biggestGap = currentGap;
                }
                currentGap = 0;
            } else { // 0 (off)
                currentGap++;
            }
        }

        return biggestGap;
    }
}


