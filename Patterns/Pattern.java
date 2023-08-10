package Patterns;

class Pattern {

    public static void main(String[] args) {
        int n = 7;

        // PATTERN: 1

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // PATTERN 2

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // PATTERN 3

        // for (int i = 0; i < n; i++) {
        // for (int j = 1; j < n - i; j++) {
        // System.out.print(" ");
        // }
        // System.out.print("*");
        // for (int j = 0; j <= 2 * i - 1; j++) {
        // if (j == (2 * i - 1))
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
        // for (int i = n - 2; i >= 0; i--) {
        // for (int j = 1; j < n - i; j++) {
        // System.out.print(" ");
        // }
        // System.out.print("*");
        // for (int j = 0; j <= 2 * i - 1; j++) {
        // if (j == (2 * i - 1))
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // PATTERN 4

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }
            System.out.print(1);

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // PATTERN 5

    }
}