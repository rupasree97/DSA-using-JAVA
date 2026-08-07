class Solution {
    public int binaryGap(int n) {
         n>>= Integer.numberOfTrailingZeros(n);
         if(n==1)
            return 0;
        int maxgap = 0;
        int gap = 0;
        while(n>0)
        {
            int temp = n&1;
            if(temp == 1)
            {
             maxgap = Math.max(gap,maxgap);
             gap = 0;
            }
            else
            {
                gap++;
            }
                n>>=1;
            
        
        }
        return maxgap+1;
    }
}