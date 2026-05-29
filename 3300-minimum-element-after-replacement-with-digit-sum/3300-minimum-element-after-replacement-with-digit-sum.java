class Solution {
    public int minElement(int[] nums) {
    for(int i = 0; i<nums.length; i++)
    {
        int temp;
        int digit = 0;
        while(nums[i]>0)
        {
            temp = nums[i];
            digit+= temp%10;
            temp = temp/10;
            nums[i] = temp;

        }
        nums[i] = digit;
    }

       int min = nums[0];
       for(int i = 0; i<nums.length;i++)
       {
        min = Math.min(min,nums[i]);
       }
      return min;  
    }
}