class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        for(int i = 0; i<=31;i++)
        {

            int ones = 0;
             for(int num:nums)
             {
                if((num>>i & 1 )== 1)
                ones++;
                
             }
             
             ans += ones * (nums.length-ones);
        }
        return ans;
    }
}