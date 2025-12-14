class Solution {
    public int numberOfWays(String corridor) {
        //T.C - o(n)
        //S.C - 0(1)
        long seats = 0, totalseats = 0, result = 1 , plants = 0;
        for(int i = 0; i<corridor.length(); i++)
        {
           char c = corridor.charAt(i);
           if(c=='S')
           {
              seats++;
              totalseats++;
              if(seats ==3)
              {
                result = result*(plants+1)%1000000007;
                seats = 1;
                plants = 0;
              }
           }
           else if(c == 'P')
           {
               if(seats ==2)
               {
                   plants++;
               }
           }
        }
        if(totalseats%2==1 || totalseats==0) 
        return 0;

        return (int)result;
        
    }
}