class Solution {
    public int maximumProduct(int[] nums) {

        int n = nums.length;
        int max1 =  Integer.MIN_VALUE;
        int max2 = max1;
        int max3 = max1;
        int min1 = Integer.MAX_VALUE;
        int min2 = min1;
        if(n<3)
        {
            return -1;
        }
        for(int i = 0; i<n; i++)
        {
            if(max1<=nums[i])
            {
             int temp = max1;
             max1 = nums[i];
             int temp2 = max2;
             max2 = temp;
             max3 = temp2;
            }
           else if(max2<= nums[i])
            {
                max3 = max2;
                max2 = nums[i];

            }
           else if(max3 <=nums[i])
            {
                max3 = nums[i];
            }
           if(min1>=nums[i])
            {
                int temp = min1;
                min1 = nums[i];
                min2 = temp;
            }
           else if(nums[i] < min2)
            {
                  min2 = nums[i];
            }


        }
        
        return Math.max(min1 * min2 * max1,  max1 * max2 * max3);
    }
}