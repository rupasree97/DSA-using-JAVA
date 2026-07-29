class Solution {
    public int maximumCount(int[] nums) {
    int negcount = binarysearch(nums,0);
    int poscount = nums.length - binarysearch(nums,1);
    return Math.max(negcount,poscount);

    }
    
        private int binarysearch(int[] nums, int target)
        {
                int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;
        int res  = nums.length;
    while(left<=right)
    {
         mid = (left+right)/2;
          
          if(nums[mid]<target)
           {
            left = mid+1;
           }
           else
           {
            res = mid;
            right = mid-1;
           }
           
    }
       return res;    
    }
}