package algorithm.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PermutationTest {

    @Test
    @DisplayName("중복이 없는 순열")
    public void permTest() {
        int[] arr = {3, 6, 9, 12};
        int[] output = new int[arr.length];
        boolean[] visited = new boolean[arr.length];

        perm(arr, output, visited, 0, arr.length, 3);
    }

    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            myPrint(output, r);
            return;
        }

        for (int i = 0; i < n; ++i) {
            if (visited[i]) continue;
            visited[i] = true;
            output[depth] = arr[i];
            perm(arr, output, visited, depth + 1, n, r);
            visited[i] = false;
        }
    }

    static void myPrint(int[] output, int r) {
        for (int i = 0; i < r; ++i) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }
}
