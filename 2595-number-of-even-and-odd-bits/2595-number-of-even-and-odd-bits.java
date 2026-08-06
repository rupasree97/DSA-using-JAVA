class Solution {
    public int[] evenOddBit(int n) {
      int even = 0;
      int odd = 0;
      for(int i = 0; i<=31;i++)
      {
      
    
      
            int temp =( n>>i)&1;
            
        if(i%2==0 && temp==1)
        {
            even++;
        }
        else if(temp==1)
        odd++;

      

      }  
      return new int[] {even,odd};
    }
}