class Solution {
    public int[] findErrorNums(int[] nums) {
       
        int sum = 0;
        int n = nums.length;
        int xorall = 0;
        int xornum = 0;
        for(int i = 1; i<=n;i++)
        {
            xorall^=i;
        }
        for(int num:nums)
        {
           xornum^=num;
        }
        int res = xorall ^ xornum;
        int setbit = res & -res;
        int xorset = 0;
        int notxorset = 0;
        for(int i=1;i<=n;i++)
        {
            if((i & setbit) != 0)
            {
                xorset^=i;
            }
            else
            {
                notxorset^=i;
            }
        }
        for(int num:nums)
        {
            if((num&setbit )!= 0)
            xorset ^=num;
            else
            notxorset^=num;
        }
        for(int num:nums)
        {
            if(num == xorset)
            {
                return new int[] {xorset, notxorset};
            }
        }
        return new int[] {notxorset, xorset};

    }
}