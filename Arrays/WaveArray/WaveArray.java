package Arrays.WaveArray;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> wave(ArrayList<Integer> A) {

        int n = A.size();
        Collections.sort(A);

        for (int i = 1; i < n; i += 2) {
            int temp = A.get(i);
            A.set(i, A.get(i - 1));
            A.set(i - 1, temp);
        }
        return A;
    }

    public static void waveNotLexographic(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[i - 1]) {
                swap(a, i, i - 1);
            }
            if (i < n - 1 && a[i] > a[i + 1]) {
                swap(a, i, i + 1);
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
