class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count = 0;
        while(left!=right)
        {
            left>>=1;
            right>>=1;
            count++;
        }
        return (left<<count);

    //     1 to n
    //     set bits

    // add all set bits from one to n
    // n = 1e9
    }
}