class Solution {
    public boolean isGood(int[] nums) {
        int max = 0, cnt = 0;
        for(int num : nums)
      {
          max = Math.max(max,num);

      }
      if(max>nums.length-1)
         return false;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++)
        {
            if(nums[i]!=i+1)
               return false;
        }
         return nums[nums.length-1] == nums.length-1;
    }
}