class Solution {
    public int maximumXOR(int[] nums) {
        int Max_xor = 0;
        for(int n:nums)
        {
            Max_xor |= n;
        }
     
      return Max_xor;
    }
}