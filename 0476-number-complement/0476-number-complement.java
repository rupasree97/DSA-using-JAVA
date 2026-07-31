class Solution {
    public int findComplement(int num) {
        int count = 0;
        int n = num;
        while(num!=0)
        {
                num = num>>1;
            count++;
        
        }
    
        long res = 1<<count;

return n^((int)res -1);
    }
}