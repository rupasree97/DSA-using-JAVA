class Solution {
    public int minRemovals(int[] nums, int target) {
          int n = nums.length;
        int dp[] = new int[16384];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for(int num : nums)
            {
                int[] temp = dp.clone();
        for(int i = 16383; i>=0; i--)
            {
               
                if(dp[i]!=-1)
                {
                        temp[i^num] = Math.max(temp[i^num],dp[i]+1);
                }
            }
                dp = temp;
     
            }
        return dp[target]== -1? -1 : n-dp[target];
    }
}