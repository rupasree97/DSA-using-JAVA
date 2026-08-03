class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums)
        {
            xor^=num;
        }
        int setbit = xor & (-xor);
        int ones = 0;
        int twos = 0;
        for(int num :nums)
        {
            if((setbit & num)==0)
                  ones^=num;
           else
           twos^=num;
                   
        }

        return new int[] {ones,twos};
    }
}