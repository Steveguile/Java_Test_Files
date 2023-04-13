package worksheet;
import java.util.*;

public class Worksheet {
    public static void main(String[] args) {
        int[] array = {1, 3, 1, 4, 2, 3, 5, 4};
        int result = Worksheet.solution(5, array);
    }

    public static int solution(int X, int[] A) {

        Set<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            treeSet.add(A[i]);
        }

        // Can't be correct, not enough members in set
        if (treeSet.size() < X) {
            return -1;
        }

        int lastVal = 1;
        for (int element: treeSet) {
            if (lastVal == X) {
                break; // No gaps up to return value X
            }
            if (element != lastVal++) {
                return -1; // Gaps in the leaves
            }
        }

        // Find first location of X in A[i]
        for (int i = 0; i < A.length; i++) {
            if (A[i] == X) {
                return i;
            }
        }

        return -1; // fallback

    }
}
