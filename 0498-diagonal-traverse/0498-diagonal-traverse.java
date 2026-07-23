class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res[] = new int[m*n];
        int col= 0;
        
        int row = 0;
     int i = 0;
     
        while(i< m*n)
        {
          res[i] = mat[row][col];
            int sum = row+col;
            if(sum%2==0)
            {
                 if(col==n-1)
                 {

                      row++;
                      
                 }
                 else if(row==0)
                 {
                      
                        col++;
                        
                 }
                 else
                 {
                   col++;
                    row--;
                    
                    
                 }
                 
            }
            else
            {
                if(row == m-1)
                {
                 
                    col++;
                }
                else if(col== 0)
                {
         
                    row++;
                }
                else
                {
                    
                   row++;
                   col--; 
                   
                }
            
            }
            i++;
        }
        return res;
    }
}