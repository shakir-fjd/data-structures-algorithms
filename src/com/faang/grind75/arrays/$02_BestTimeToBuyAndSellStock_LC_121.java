package com.faang.grind75.arrays;

/**
 * Created By Mohammad Shakir - 22/09/2022
 */
public class $02_BestTimeToBuyAndSellStock_LC_121 {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;

        getMaximumProfitAfterSellingStock(prices, n);
        optimisedMethodToGetMaximumProfitAfterSellingStock(prices,n);
    }

    private static void optimisedMethodToGetMaximumProfitAfterSellingStock(int[] prices, int n) {
        int maximumProfit = Integer.MIN_VALUE;
        int minimumPrice = prices[0];
        for (int i = 1; i < n; i++) {
            int currentPrice = prices[i] - minimumPrice;
            maximumProfit = Math.max(maximumProfit, currentPrice);
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }
    }

    private static void getMaximumProfitAfterSellingStock(int[] prices, int n) {
        int pointer1 = 0;
        int pointer2 = 1;
        int maximumProfit = Integer.MIN_VALUE;
        while (pointer2 < n) {
            if (prices[pointer1] < prices[pointer2]) {
                int priceDifference = prices[pointer2] - prices[pointer1];
                maximumProfit = Math.max(maximumProfit, priceDifference);
            } else {
                pointer1 = pointer2;
            }
            pointer2++;
        }
    }
}
