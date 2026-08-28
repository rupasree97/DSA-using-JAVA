class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> p = new HashSet<>();
        for(int i = 2; i<=1000;i++)
        {
            if(isprime(i))
            {
                p.add(i);
            }
        }
        HashSet<Integer> s = new HashSet<>();
        for(int i: nums)
        {
            for(int res : p)
            {
                if(i%res == 0)
                s.add(res);
            }
        }
        return s.size();

    }
    private boolean isprime(int n)
    {
        if(n<=1)
        return false;
        for(int i = 2; i*i<=n;i++)
        {
            if(n%i == 0)
            return false;
        }
        return true;
    }

}