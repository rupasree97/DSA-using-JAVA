class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap <Integer,Integer> h = new HashMap<>();
        int l = 0;
        int n = nums.length;
        int max = 0;
        for(int r = 0; r<n;r++)
        {

             h.put(nums[r], h.getOrDefault(nums[r],0)+1);
           
            while(h.get(nums[r]) > k)
            {
                 h.put(nums[l], h.get(nums[l]) -1) ;
                  l++;
              }
                    max = Math.max(max,r-l+1);
          
        }
        return max;
    }
}