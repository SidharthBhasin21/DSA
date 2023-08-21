package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {

        // findSubstrings("abc");
        System.out.println(fastPow(5, 2));

    }

    // Sum of n natural numbers;
    static void sumN(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sumN(n - 1, sum + n);
    }

    // Fibonacci Number
    static int fibo(int n) {
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    // Power Function
    static int pow(int x, int n) {
        if (n == 0)
            return 1;
        return pow(x, n - 1) * x;
    }

    // Palindrome
    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) {

            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    // Factorial of a number
    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        return factorial(n - 1) * n;

    }

    // Calculate the value of nCr
    public static int nCr(int n, int r) {
        if (r > n)
            return 0;
        if (n == r || r == 0)
            return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);

    }

    // Josephus Problem
    public static int josephus(int n, int k) {
        if (n == 1)
            return 0;

        return (josephus(n - 1, k) + k) % n;

    }

    // Count the Occurrences of a String
    public static int count(String text, String word) {
        return countHelper(text, word, 0);
    }

    private static int countHelper(String text, String word, int i) {
        if (i > text.length() - word.length())
            return 0;
        if (text.substring(i, i + word.length()).equals(word)) {
            return countHelper(text, word, i + 1) + 1;
        } else {
            return countHelper(text, word, i + 1);
        }
    }

    // Subsets of a string
    public static List<String> findSubstrings(String s) {

        List<String> answer = new ArrayList<>();

        findSubstringsHelper(s, answer, 0, "");
        Collections.sort(answer);
        return answer;
    }

    private static void findSubstringsHelper(String s, List<String> answer, int i, String cur) {
        if (i == s.length()) {
            answer.add(cur);
            return;
        }
        findSubstringsHelper(s, answer, i + 1, cur + s.charAt(i));
        findSubstringsHelper(s, answer, i + 1, cur);

    }
    // Fast power

    public static int fastPow(double x, int n) {
        if (n == 0)
            return 1;
        if ((n & 1) == 0)
            return fastPow(x * x, n / 2);
        else
            return (int) x * fastPow(x, n - 1);
    }

}
