class Solution {
    long MOD = 1000000007;
    long ans = 0;
    long odd = 0;
    long even = 0;

    
    private long power(long base,long exp)
    {
        long res = 1;
        if(exp==0)
        {
          return 1;
        }
      res =  power(base,exp/2);
        if(exp%2 == 0)
         res = (res * res)%MOD;
         else if(exp%2!=0)
         res = ((base * res)%MOD *res)%MOD;

         return res;
    }
    public int countGoodNumbers(long n) {
       even = (n+1)/2;
       odd = n/2;
        long i = power(5,even);
        long j = power(4,odd);
        ans =(i*j)%MOD;
        return (int)ans;
    }
}