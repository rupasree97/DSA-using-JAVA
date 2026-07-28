class Solution {
    public int[][] generateMatrix(int n) {
    int m[][] = new int[n][n];
    if(n==0)
      return m;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int num = 1;

        while(left<=right && top<=bottom)
        {
        for(int i = left; i<=right; i++)
        {
                  m[top][i] = num++;
        }
        top++;
        for(int i = top; i<=bottom; i++)
        {
            m[i][right]  = num++;
        }
        right--;
        for(int i = right; i>=left; i--)
        {
        
            m[bottom][i] = num++;
        }
        bottom--;
        for(int i = bottom; i>=top; i--)
        {
            
            m[i][left] = num++;
        }
        left++;
        }
        return m;
    }
}