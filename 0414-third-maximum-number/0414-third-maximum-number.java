class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
         long first =  Long.MIN_VALUE;
         long second = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i] > first)
            first = nums[i];
        }
        for(int i = 0; i<n;i++)
        {
            if(nums[i] >  second && nums[i]<first)
            {
                second = nums[i];
            }
        }
        for(int i = 0; i<n;i++)
        {
            if(nums[i] > t && nums[i] < first && nums[i] < second)
            t = nums[i];
        }

       if(t==Long.MIN_VALUE)
       t = first;

       return (int)t;
    }
}