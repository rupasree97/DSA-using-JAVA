class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int m = nums.length/2;
        int count = 0;
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[m] == nums[i])
            count++;
            if(count>1)
            return false;
        }
        return true;
    }
}