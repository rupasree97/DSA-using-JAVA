class Solution {
    public boolean canJump(int[] nums) {
       
       int jump = nums.length-1;
       for(int i = nums.length-2; i>=0; i--)
       {
    
        if(nums[i] + i  >= jump )
        jump = i;
       }
       return jump==0;
    }
}