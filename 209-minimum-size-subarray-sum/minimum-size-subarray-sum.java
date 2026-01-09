class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i<nums.length;i++)
        {
             sum+=nums[i];
             while(sum>=target)
             {
                ans = Math.min(ans,i-left+1);
                sum = sum -nums[left];
                left++;


             }
        }
        return (ans==Integer.MAX_VALUE)?0:ans;
        
    }
}