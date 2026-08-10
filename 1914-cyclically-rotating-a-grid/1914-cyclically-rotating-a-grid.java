class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length-1;
        int n = grid[0].length-1;
       
        int startrow = 0;
        int endrow = m;
        int startcol = 0;
        int endcol = n;
        while(startrow < endrow && startcol < endcol)
        {
            int wid = endrow - startrow, len = endcol - startcol;
            int perimeter = 2*len+2*wid;
            int r = k%perimeter; 
        while(r-- > 0)
        {
            
            int temp = grid[startrow][startcol];
             for(int i =startcol; i<endcol; i++)
             {
                grid[startrow][i] = grid[startrow][i+1]; 
             }
             for(int i = startrow; i<endrow; i++)
             {
                grid[i][endcol] = grid[i+1][endcol];
             }
             for(int i = endcol; i>startcol; i--)
             {
                grid[endrow][i] = grid[endrow][i-1];
             }
             for(int i = endrow; i>startrow; i--)
             {
                grid[i][startcol] = grid[i-1] [startcol];
             }
             grid[startrow+1][startcol] = temp;
        }
            
             startrow++;
             endrow--;
             startcol++;
             endcol--;
        } 
        return grid;  
    }
}