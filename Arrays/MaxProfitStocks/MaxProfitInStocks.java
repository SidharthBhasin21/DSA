package Arrays.MaxProfitStocks;

public class MaxProfitInStocks {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int temp = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (temp > prices[i])
                temp = prices[i];

            max = Math.max(max, prices[i] - temp);
        }

        return max;
    }
}
