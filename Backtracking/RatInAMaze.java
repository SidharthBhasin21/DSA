package Backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1, 0 },
                { 1, 0, 0, 1 },
                { 1, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        int n = mat.length;
        int m = mat[0].length;

        boolean visited[][] = new boolean[n][m];
        visited[0][0] = true;
        ratMaze(mat, visited, 0, 0, "", n, m);

    }

    static void ratMaze(int mat[][], boolean visited[][], int i, int j, String path, int n, int m) {
        if (i == (n - 1) && j == (m - 1)) {
            System.out.println(path);
        } else {
            if (isValid(i + 1, j, mat, visited, n, m)) { // Down

                visited[i + 1][j] = true;
                ratMaze(mat, visited, i + 1, j, path + 'D', n, m);
                visited[i + 1][j] = false;
            }
            if (isValid(i, j - 1, mat, visited, n, m)) { // Left
                visited[i][j - 1] = true;
                ratMaze(mat, visited, i, j - 1, path + 'L', n, m);
                visited[i][j - 1] = false;
            }
            if (isValid(i, j + 1, mat, visited, n, m)) { // Right
                visited[i][j + 1] = true;
                ratMaze(mat, visited, i, j + 1, path + 'R', n, m);
                visited[i][j + 1] = false;
            }
            if (isValid(i - 1, j, mat, visited, n, m)) {// UP
                visited[i - 1][j] = true;
                ratMaze(mat, visited, i - 1, j, path + 'U', n, m);
                visited[i - 1][j] = false;
            }

        }

    }

    static boolean isValid(int i, int j, int[][] mat, boolean[][] visited, int n, int m) {

        return (i < n && i >= 0 && j < m && j >= 0 && (mat[i][j] == 1) && !visited[i][j]);

    }
}
