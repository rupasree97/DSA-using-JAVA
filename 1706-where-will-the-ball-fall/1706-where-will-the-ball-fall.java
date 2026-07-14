class Solution {
    private int check(int[][] grid,int i, int j)
    {
        if(i == grid.length)
        {
            return j;
        }
        if(grid[i][j] == 1 && j+1< grid[0].length && grid[i][j+1] == 1)
        {
            return check(grid,i+1,j+1);
        }
        else if(grid[i][j] == -1 && j-1 >=0  && grid[i][j-1] == -1)
        {
            return check(grid, i+1,j-1);
        }
        return -1;
    }
    public int[] findBall(int[][] grid) {
        int m = grid[0].length;
        int ans[] = new int[m];
        for(int j = 0; j<m; j++)
        {
            ans[j] = check(grid,0,j);
        }
        return ans;
    }
}