class Solution {
    public int absDifference(int[] nums, int k) {
        int min_sum = 0,max_sum = 0,n = nums.length; 
        if(nums.length==1)
        return 0;
        else
        {
            Arrays.sort(nums);
            for(int i = 0; i<=k-1;i++)
            {
               min_sum += nums[i];
            }
            for(int i =n-1; i>=n-k; i--)
            {
                   max_sum+=nums[i];
            }

        }
        return Math.abs(max_sum - min_sum);
        
    }
}