class Solution {
    public int reverse(int x) {
        int sign;
        if(x<0)
        {
            sign = -1;
            x = Math.abs(x);
            }
        else
        {
            sign = 1;

        }
        int rev = 0;
        while(x>0)
        {
           int num = x%10;
           if(rev>(Integer.MAX_VALUE - num)/10)
           {
            return 0;
           }
           rev = (rev*10)+num;
             x = x/10;
        }
      
      
    return rev *sign;
        
    }
}