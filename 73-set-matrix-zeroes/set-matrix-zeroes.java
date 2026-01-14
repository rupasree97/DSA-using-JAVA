class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols =matrix[0].length;
        boolean rowzero = false;
        for(int r =0; r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                if(matrix[r][c] == 0)     //updating 1st column and 1st row
                { 
                  matrix[0][c] = 0;      
                  if(r>0) matrix[r][0]=0;
                  else
                  rowzero = true;


                }
            }
        }
        
        for(int r = 1; r<rows;r++)
        {
            for(int c =1; c<cols;c++)
            {
                if(matrix[r][0]==0 || matrix[0][c]==0) //updating remaining part
                matrix[r][c] = 0;
            }

        }
        if(matrix[0][0]==0)
        {
            for(int r = 0;r<rows;r++)   //updating first col elements(col is fixed and rows will change)
            {
                 matrix[r][0] = 0;
            }
        }
        if(rowzero)
        {
            for(int c =0;c<cols;c++)   //updating 1st row elements (row fixed cols will change)
            {
                matrix[0][c] =0;
            }
        }
    }
}