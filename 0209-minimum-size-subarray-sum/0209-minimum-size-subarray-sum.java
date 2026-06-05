class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for(int right = 0; right<=n-1; right++)
        {
            
           sum+= nums[right];
           while(sum>=target)
           {
            ans = Math.min(ans, right-left+1);
            sum-=nums[left];
            left++;
           }
          


        }

         if(ans == Integer.MAX_VALUE)
             return 0;
             else
             return ans;
        
    }
}