class Solution {
       boolean issafe(int i, int j, char[][] board,int n)
    {
        //top rows
        int temp_i = i;
        int temp_j = j;
       while(temp_i >=0){
        if(board[temp_i][temp_j] == 'Q')
        return false;
        temp_i--;
       }
       //top left
       temp_i = i;
       temp_j = j;
       while(temp_i>=0 && temp_j>=0)
       {
        if(board[temp_i][temp_j] == 'Q')
        return false;
        temp_i --;
        temp_j --;
       }
       //top right
       temp_i  = i;
       temp_j = j;
       while(temp_i>=0 && temp_j < n)
       {
        if(board[temp_i][temp_j] == 'Q')
        return false;
        temp_i--;
        temp_j++;
       }
       return true;
    }
        
    private void fun(int row,char[][] board,ArrayList<List<String>> res,int n)
    {
        if(row>=n)
        {
           
           List<String> s = new ArrayList<>();
           for(int i =0;i<board.length;i++)
           {
            s.add(String.valueOf(board[i]));
           }
            res.add(s);
            return;
        }
        for(int i=0;i<n;i++)
        {
          if(issafe(row,i,board,n))
          {
            board[row][i] = 'Q';
            fun(row+1,board,res,n);
            board[row][i] = '.';
          }
        }

    }
    public int totalNQueens(int n) {
        ArrayList<List<String>> res = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i =0;i<n;i++)
        {
        Arrays.fill(board[i],'.');
        }
        fun(0,board,res,n);
    return res.size();

    }

}