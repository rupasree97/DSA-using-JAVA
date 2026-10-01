class Solution {
    int count = 0;
    private boolean fun(int i,int j,char[][] board,String word,int count)
    {

      if(count == word.length())
      {
        return true;
      }
      if(i<0 || i>=board.length|| j<0 || j>=board[0].length || board[i][j] != word.charAt(count))
      return false;

      char ch = board[i][j];
      board[i][j] = '#';
         boolean ans = fun(i+1,j,board,word,count+1) ||
            fun(i,j+1,board,word,count+1) || fun(i,j-1,board,word,count+1)||
            fun(i-1,j,board,word,count+1);
            board[i][j] = ch;
            return ans;  
        
     }
    
    
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length;i++)
        {
            for(int j = 0;j<board[0].length;j++)
          {
            if(fun(i,j,board,word,0))
            return true;
          }

        }
       return false;
    }
}