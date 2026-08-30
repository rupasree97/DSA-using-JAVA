class Solution {
    public int minimumDeletions(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        if(nums.length == 1)
        {
            return 1;
        }
        for(int i = 1; i<nums.length;i++)
        {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        int c = 0;
        int minfrontcount = 0;
        int maxfrontcount = 0;
        int n = nums.length;
        for(int i = 0; i<n;i++)
        {
            
                c++;
            if(min == nums[i])
            {
                minfrontcount = c;
            }
            else if(max == nums[i])
            {
                maxfrontcount = c;
            }
          
            
        }
        int bothfront = Math.max(minfrontcount,maxfrontcount);
        int minback = n-minfrontcount+1;
        int maxback = n-maxfrontcount+1;
        int bothback  = Math.max(minback,maxback);

        int case3 = maxfrontcount + minback;
        int case4  = minfrontcount + maxback;
        return Math.min(Math.min(bothfront,bothback),Math.min(case3,case4));

        
    }
}