class Solution {
    public int minOperations(int[] nums) {
        int res = -1;
        int n = nums.length;
        int ones = 0;
        for(int num:nums)
        {
            if(num==1)
            ones++;
        }
        if(ones>0)
        {
            return n-ones;
        }
        int min = n+1;
        for(int i = 0; i<n;i++)
        {
            int g = 0;
            for(int j = i;j<n;j++)
            {
                g = gcd(g,nums[j]);
                if(g == 1)
                {
                    min = Math.min(min,j-i+1);
                    break;
                }
                
            }


        }
        if(min == n+1)
        return -1;

        return n+min-2;
    }
    private int gcd(int n1,int n2)
    {
        while(n2!=0)
        {
           int temp = n1%n2;
           n1 = n2;
           n2 = temp;
        }
        return n1;
    }
}