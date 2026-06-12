class Solution {
    public int maxProfit(int[] prices) {
    int buy = prices[0];
    int sell = 0;
    if(prices.length==1)
    return 0;
    for(int i = 0; i<prices.length; i++)
    {
       buy =  Math.min(prices[i], buy);
       sell = Math.max(sell,prices[i] - buy);
    
    }

        return sell;
    }
}