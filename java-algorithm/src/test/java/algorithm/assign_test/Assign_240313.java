package algorithm.assign_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign_240313 {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        boolean[][] mines = new boolean[N + 1][N + 1];
        for (int i = 0; i < K; i++) {
            input = br.readLine();
            inputs = input.split(" ");
            if (inputs.length < 1 || inputs[0].isEmpty()) break;
            int r = Integer.parseInt(inputs[0]);
            int c = Integer.parseInt(inputs[1]);
            mines[r][c] = true;
        }

        System.out.println(countPaths(N, mines));
    }

    static int countPaths(int N, boolean[][] mines) {
        int[][] dp = new int[N + 1][N + 1];

        // Base case
        dp[1][1] = 1;

        // Fill the first row
        for (int c = 2; c <= N; c++) {
            if (!mines[1][c]) {
                dp[1][c] = dp[1][c - 1];
            }
        }

        // Fill the first column
        for (int r = 2; r <= N; r++) {
            if (!mines[r][1]) {
                dp[r][1] = dp[r - 1][1];
            }
        }

        // Fill the rest of the dp array
        for (int r = 2; r <= N; r++) {
            for (int c = 2; c <= N; c++) {
                if (!mines[r][c]) {
                    dp[r][c] = (dp[r - 1][c] + dp[r][c - 1]) % MOD;
                }
            }
        }

        return dp[N][N];
    }
}
