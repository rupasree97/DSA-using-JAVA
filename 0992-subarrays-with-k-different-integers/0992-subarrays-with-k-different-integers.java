class Solution {

    public int atmost(int nums[], int k)
    {
          int left = 0;
          int res = 0;
          int distinct = 0;
          HashMap <Integer,Integer> freq = new HashMap<>();
          for(int right = 0; right < nums.length; right++)
          {
            freq.put(nums[right], freq.getOrDefault(nums[right],0)+1);
            if(freq.get(nums[right]) == 1)
            distinct++;
            while(distinct>k)
            {
                freq.put(nums[left], freq.get(nums[left])-1);
                if(freq.get(nums[left]) == 0)
                {
                distinct --;
                }
                left++;
            }
            res+=(right-left+1);
               
          }
          return res;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {

    return atmost(nums, k) - atmost(nums, k-1);



        
    }

}