class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        int i = 0;
        while(i<=n)
        {
             arr[i] = shift(i);
             i++;
        }
        return arr;

    }
    public int shift(int i)
    {
        int count = 0;
        while(i>0)
        {
            count+=(i&1);
            i = i>>1;
        }
        return count;
}
}