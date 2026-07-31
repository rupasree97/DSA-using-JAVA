class Solution {
    public int xorOperation(int n, int start) {
        int prev = 0;
        int sum = 0;
        for(int i = 0; i<n;i++)
        {
             prev  = start+2*i;
             sum ^= prev;
        }
        return sum;
    }
}