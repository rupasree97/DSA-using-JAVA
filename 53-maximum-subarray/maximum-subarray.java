class Solution {
    public int maxSubArray(int[] nums) {
     
       int Max_sum = nums[0];
       int sum = 0;

       for(int i = 0; i<nums.length;i++)
       {     
              if(sum < 0)
              {
                sum = 0;
              }
            sum+=nums[i];
            Max_sum = Math.max(sum,Max_sum);
       }
      return Max_sum;  
    }
}