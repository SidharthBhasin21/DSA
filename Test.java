public class Test {
    public static int x = 5;

    public static void main(String[] args) {
        System.out.println(toDecimal("10"));
    }

    public static int toDecimal(String str) {

        int ans = 0;
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            int temp = (str.charAt(i)) - 48;
            int pow = (int) Math.pow(2, (n - i - 1));
            ans += temp * pow;
        }
        return ans;
    }
}
