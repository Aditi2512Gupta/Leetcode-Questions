class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;

        // int maxProfit = 0, bestBuy = prices[0];

        // for(int i = 1; i < prices.length; i++) {
        //     if(prices[i] > bestBuy) {
        //         maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
        //     }
        //     bestBuy = Math.min(bestBuy, prices[i]);
        // }

        // return maxProfit;
    }
}