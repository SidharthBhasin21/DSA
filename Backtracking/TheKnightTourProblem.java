package Backtracking;

import java.util.Arrays;

public class TheKnightTourProblem {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = knightTour(5, 5);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

    }

    private static int[][] knightTour(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = -1;
            }
        }
        a[0][0] = 0;
        int movesX[] = new int[] { 2, 1, -1, -2, -2, -1, 1, 2 };
        int movesY[] = new int[] { 1, 2, 2, 1, -1, -2, -2, -1 };
        helper(n, m, a, movesX, movesY, 0, 0, 1);

        return a;

    }

    private static boolean helper(int n, int m, int a[][], int movesX[], int movesY[], int curX, int curY, int steps) {

        if (steps == n * m)
            return true;

        for (int i = 0; i < 8; i++) {
            int nextX = curX + movesX[i];
            int nextY = curY + movesY[i];

            if (isValid(n, m, a, nextX, nextY)) {
                a[nextX][nextY] = steps;
                boolean isTourCompleted = helper(n, m, a, movesX, movesY, nextX, nextY, steps + 1);

                if (isTourCompleted) {
                    return true;
                }

                a[nextX][nextY] = -1;

            }
        }
        return false;

    }

    private static boolean isValid(int n, int m, int a[][], int x, int y) {

        return (x >= 0 && y >= 0 && x < n && y < m && a[x][y] == -1);

    }
}
