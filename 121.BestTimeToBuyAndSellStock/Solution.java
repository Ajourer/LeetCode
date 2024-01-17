package BestTimeToBuyAndSellStock;

public class Solution {
    public static void main (String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2));

    }

    public static int maxProfit(int[] prices) {
        int left = 0; //bye
        int right = 1; //sell
        int maxPr = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxPr = Math.max(maxPr, profit);
            }
            else
                left = right;
            right++;
        }
        return maxPr;
    }
}
