class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long place = 1;
        long x = 0;
    
        while(n>0)
        {
            long temp = n%10;
            if(temp!=0)
            {
               x = temp * place +x;
               sum+=temp;
               place = place * 10;


            }
            n = n/10;

        }
      
        return  (sum * x);
        
    }
}