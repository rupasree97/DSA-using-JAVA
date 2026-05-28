class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        int count = 1;
        if(nums.length==1)
        return 1;
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[temp] != nums[i] )
            {
                nums[temp+1] = nums[i];
                count++;
                temp = temp+1;
            }
            
        }
        return count;
    }
}