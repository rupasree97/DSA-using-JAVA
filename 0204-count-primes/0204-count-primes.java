class Solution {
    public int countPrimes(int n) {
        if(n== 0 || n == 1 || n==2)
           return 0;
           boolean res[] = new boolean[n];
       
            Arrays.fill(res,true);
                res[0] = false;
           res[1] = false;
           res[2] = true;
            int count = 0;
        for(int i = 2;  i*i<n; i++)
        {
             if(res[i])
             {
                    for(int j = i*i; j<n; j+=i)
                    {
                       
                            res[j] = false;
                            
                        }


                    }

             }
        

        for(boolean r :res)
        {
            if(r)
            count++;
        }
        return count;
    }
}