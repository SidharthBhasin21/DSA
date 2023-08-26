package Backtracking;

public class PemutatuinOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        permutations(arr, 0, arr.length - 1);
    }

    private static void permutations(int[] a, int l, int r) {
        if (l == r) {
            printArray(a);
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(a, i, l);
            permutations(a, l + 1, r);
            swap(a, i, l);
        }
    }

    private static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    private static void printArray(int a[]) {
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
    }
}
