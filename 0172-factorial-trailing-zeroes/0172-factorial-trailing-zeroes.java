class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        if(n<=4)
        return 0;
        if(n>=5 && n<=9)
        return 1;
      
      
       while(n>0)
       {

             
         n = n/5;
         count+=n;
        
          
    
       }
       
    return count;
    }
}