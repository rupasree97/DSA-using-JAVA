class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int cheap_price = prices[0];
        for(int i = 1; i<prices.length;i++)
        {
             if(cheap_price < prices[i])
             {
                  max_profit = Math.max(max_profit, prices[i] - cheap_price);
             }
             else
             cheap_price = prices[i];
        }
        return max_profit;
        
    }
}