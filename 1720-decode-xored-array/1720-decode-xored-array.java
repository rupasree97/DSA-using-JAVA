class Solution {
    public int[] decode(int[] encoded, int first) {
        int res[] = new int[encoded.length+1];
        res[0] = first;
        int idx = 1;
        for(int i = 1; i<=encoded.length;i++)
        {
            res[idx] = res[i-1] ^ encoded[i-1];
            idx++;
        }
        return res;
        
    }
}