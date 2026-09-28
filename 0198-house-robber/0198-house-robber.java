class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length>=2)
        dp[1] = Math.max(nums[0],nums[1]);
        if(nums.length == 2)
        {
            return Math.max(nums[0],nums[1]);
        }
        int n = nums.length;
        for(int i =2;i<n;i++)
        {
             dp[i]   = Math.max(dp[i-1], nums[i]+dp[i-2]);
           
              
        }
        return dp[n-1];
    }
}