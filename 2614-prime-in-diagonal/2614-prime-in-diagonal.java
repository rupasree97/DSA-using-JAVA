class Solution {
    private boolean isprime(int n)
    {
         if(n == 1 || n == 0)
         return false;
          for(int i = 2; i*i<=n;i++)
          {
            if(n%i == 0)
              return false;
          }
          return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int n = nums.length;
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = 0; j<nums[0].length; j++)
            {
                if((i ==j || j==n-i-1) && max < nums[i][j])
                {
                     if(isprime(nums[i][j]))
                     max = Math.max(nums[i][j],max);
                }
            }
        }
        return max;
    }
}