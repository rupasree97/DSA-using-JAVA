class Solution {
    public int hammingDistance(int x, int y) {
        int res1 = 0;
        int res2 = 0;
        int count = 0;
        int i =1;
        while(x>0 || y>0) 
        {
            res1 = x&1;
            res2 = y&1;
            if(res1 != res2)
            count++;
            x = x>>1;
            y = y>>1;
           i =  i<<1;
        

            
        }
        return count;
    }
}