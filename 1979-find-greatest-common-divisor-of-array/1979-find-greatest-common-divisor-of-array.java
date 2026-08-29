class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i <nums.length;i++)
        {
            min = Math.min(min,nums[i]);
         max = Math.max(max,nums[i]);
        }
        int res = gcd(min,max);
        return res;

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