class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length==1)
        return 0;
        Arrays.sort(nums);
        int i = 0;
        int maxlen = 0;
        for(int j = 0; j<nums.length;j++)
        {
            if((long)nums[j] > (long)nums[i]*k)
            {
               i++;
            }
       maxlen = Math.max(maxlen,j-i+1);
        }

      return nums.length-maxlen;  
    }
}