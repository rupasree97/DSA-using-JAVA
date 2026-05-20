class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = B.length;
        int res[] = new int[n];
        boolean seenA[] = new boolean[n+1];
        boolean seenB[] = new boolean[n+1];
        for(int i = 0; i<n; i++)
        {
            seenA[A[i]] = true;
            seenB[B[i]] = true;
            res[i] = (i == 0)? 0 : res[i-1];
            if(A[i] == B[i])
            {
               res[i]++;
            }
            else
            {
                if(seenA[B[i]])
                    res[i]++;

                if(seenB[A[i]])
                    res[i]++;
            }
        }
        return res;
    }
}