class Solution {
    public long getDescentPeriods(int[] prices) {
        long count = 1,ans = 0;
        for(int i = 1; i<prices.length;i++)
        {
            if(prices[i-1]-prices[i] == 1)
            {
                count++;
            }
            else
            {
                ans += (count*(count+1))/2;
                count = 1;
            }

        }
        ans += (count *(count+1))/2;
        return  ans;
        
    }
}