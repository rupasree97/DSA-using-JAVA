class Solution {
    static  long mod = 1000000007;
    public int maxNiceDivisors(int primeFactors) {
        if(primeFactors<=3)
        return primeFactors;
        int q = primeFactors/3;
        int r = primeFactors%3;
        int p = 0;
        if(r==0)
        {
           return(int) pow(3,q);
        }
        else if(r==1)
        {
          p =(int) (4*pow(3,q-1)%mod);
        }
        else
        {
            p = (int) (2 * pow(3, q)%mod);
        }
        return p;
        
    }
    private long pow(long b,long e)
    {
        long ans = 1;
        while(e > 0)
        {
            if(e%2==1)
            {
                ans = ans* b % mod;
            }
            b = b*b % mod;
            e = e/2;
        }
        return ans;
    }
}