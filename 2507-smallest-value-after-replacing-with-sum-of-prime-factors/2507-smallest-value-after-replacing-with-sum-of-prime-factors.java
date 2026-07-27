class Solution {
   
    public int smallestValue(int n) {
    
 
      int s =  sumoffactors(n);
       if(s==n)
       return n;
       return  smallestValue(s);

    }
     public int sumoffactors(int n)
    {
          int f = 2;
          int sum = 0;
          while(f*f<=n)
          {
            if(n%f == 0)
            {
                sum+=f;
                n = n/f;

            }
            else
            {
                f++;
            }
          }
          if(n>1)
          {
            sum+=n;
          }
          return sum;
    }

}