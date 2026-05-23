class Solution {
    public boolean check(int[] nums) {

    boolean change = false;
    int n = nums.length;
    for(int i = 0; i<nums.length; i++)
    {
        if(nums[i]>nums[(i+1)%n])
        {
            if(change) return false;
            change  = true;
        }
    } 
    return true;       
    }
}