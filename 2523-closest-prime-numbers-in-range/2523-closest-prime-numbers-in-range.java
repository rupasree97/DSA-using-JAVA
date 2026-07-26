class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean isprime[] = new boolean[right+1];
        Arrays.fill(isprime,true);
        isprime[0] = false;
        isprime[1] = false;
        for(int i = 2; i<=right; i++)
        {
           if(isprime[i])
           {
            for(int j = 2*i; j<=right; j+=i)
            {
                  isprime[j] = false;
            }
           }

        }
        ArrayList <Integer> prime = new ArrayList<>();
        for(int i = left; i<=right; i++)
        {
            if(isprime[i] )
            {  

             prime.add(i);

            }
        }  
        if(prime.size() < 2)
        {
            return new int[]{-1,-1};
        }
        int min = Integer.MAX_VALUE;
        int res[] = {-1,-1};
        for(int i = 1; i<prime.size(); i++ )
        {
           int gap = prime.get(i) - prime.get(i-1);
           if(gap<min)
           {
            min = gap;
            res[0] = prime.get(i-1);
            res[1] = prime.get(i);
           }
    }
    return res;      
    }
}