class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count  = 0;
        for(int i = left;i<=right;i++)
        {
            int bitcount = Integer.bitCount(i);
            if(isprime(bitcount))
            {
                count++;
            }


        }
      return count;
    }
      private boolean isprime(int n)
      {
        if(n<=1)
        {
            return false;
        }
        for(int i = 2; i*i<=n;i++)
        {
            if(n%i==0)
            {
               return false;
            }
        }
        return true;
      }  
    
}