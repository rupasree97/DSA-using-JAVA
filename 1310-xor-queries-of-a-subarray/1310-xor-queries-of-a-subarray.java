class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int prefix[] = new int[arr.length];
        int prev = 0;
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length;i++)
        {
        
            prefix[i] = arr[i] ^ prefix[i-1];
        }
        int res[] = new int[queries.length];
        int i = 0;
        for(int[] q: queries)
        {
            int left = q[0];
            int right = q[1];
            if(left == 0)
            res[i] = prefix[right];
            else
            res[i] = prefix[right]^ prefix[left-1];
            i++;

    
        }
    return res;
    }
}