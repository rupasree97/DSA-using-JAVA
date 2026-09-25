class Solution {
    boolean issafe(int row,int col,char[][] board,char num)
    {
        int i = 0;
    
        while(i< 9)
        {
            if(board[i][col]  == num)
            return false;
            i++;
        }
      
       
    int    j = 0;

          while(j < 9)
          {
    if(board[row][j] == num)
        return false;
           j++;
           }
       int r = row/3 * 3;
       int c = col/3 * 3;
       for(int k = r;k<r+3; k++)
       {
        for(int l = c; l<c+3; l++)
        {
            if(board[k][l] == num)
            return false;
        }
       }
       return true;
        
    }
    boolean solve(char[][] board)
    {
        int r = -1;
        int c = -1;
        for(int i = 0; i<9;i++)
       { 
        for(int j = 0;j<9;j++)
        {
        if(board[i][j] ==  '.')
        {
            r = i;
            c = j;
            break;
        }
        }
        if(r!=-1)
        break;

       }
       if(r == -1)
         return true;
         for(char i = '1'; i<='9';i++)
         {
            if(issafe(r,c,board,i))
            {
                board[r][c] = i;
                if(solve(board))
                return true;
                board[r][c] = '.';
            }
         }
         return false; 

    }
    public void solveSudoku(char[][] board) {
       solve(board);
    }
}