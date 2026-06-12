class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int prev = 0;
        for(int i = 1; i<n;i++)
        {
              if(nums[prev]!=nums[i])
              {
                 nums[prev+1] = nums[i];
                 prev++;
              } 

        }
        return prev+1;
       
    }
}