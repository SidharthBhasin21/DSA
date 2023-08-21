public class Test {
    public static int x = 5;

    public static void main(String[] args) {
        fun(3);
    }

    static void fun(int n) {
        if (n < 0)
            return;
        fun(n - 1);
        System.out.print(n);
        fun(n - 1);
    }

}
