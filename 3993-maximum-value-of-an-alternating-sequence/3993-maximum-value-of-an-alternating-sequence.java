class Solution {
    public long maximumValue(int n, int s, int m) {
      
        
          long  add = n/2;
         
            
    
      return s+add*(m-1)+ (n>1 ? 1:0);
   }  
}