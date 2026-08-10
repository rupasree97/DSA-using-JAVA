class Solution {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        while(a>0|| b>0 || c>0)
        {
            
            int aa = a&1;
            int bb = b&1;
            if((c&1) == 0)
            {
                if(aa == 1)
                res++;
                if(bb == 1)
                res++;
            }
            else if(aa == 0 && bb == 0)
            res++;
        a>>=1;
        b>>=1;
        c>>=1;
        }
        return res;
    }
}