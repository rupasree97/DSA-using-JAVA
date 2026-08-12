class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int n = nums.length;
        double avg = 0;
        long sum = 0;
        double Max = Integer.MIN_VALUE;
        if(nums.length==1)
        return (double) nums[0];
        for(int r = 0; r<n;r++)
        {
            sum+=nums[r];
             avg =(double) sum /( r-l+1);
            
             if(r-l+1 > k)
             {
                sum-=nums[l];
                l++;
                avg = (double) sum/(r-l+1);
                
             }
             if(r-l+1 == k)
             Max = Math.max(Max,avg);
           
    
        }
      return Max;  
    }
}