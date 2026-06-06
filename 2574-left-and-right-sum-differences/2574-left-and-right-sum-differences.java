class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n = nums.length;
        int res[] = new int[n];
        int leftsum = 0;
        int rightsum = 0;
        int total = 0;
        for(int i = 0; i<n; i++)
        {
            total+=nums[i];
        }
         for(int i =0; i<n; i++)
         {
               rightsum = total-leftsum-nums[i]; 
               
               res[i] = Math.abs(leftsum-rightsum);
               leftsum+=nums[i];
               
               
         }

         return res;
        
    }
}