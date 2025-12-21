class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, Maxcount = 0;
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count+=1;
                Maxcount = Math.max(count,Maxcount);
            }
            else
            {
                count =0;
            }
        }

      return Maxcount;  
    }
}