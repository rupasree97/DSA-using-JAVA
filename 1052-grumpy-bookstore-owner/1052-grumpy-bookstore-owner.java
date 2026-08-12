class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l = 0;
        int n = grumpy.length;
        int max = 0;
        int sum1 = 0;
          for(int i = 0; i<n;i++)
        {
            if(grumpy[i] == 0)
            sum1+=customers[i];
        }
        int sum2 = 0;
        for(int r = 0; r<n;r++)
        {
         
              if(grumpy[r]==1)
            sum2+=customers[r];
          
          if(r-l+1 > minutes)
          {

             if(grumpy[l] == 1)

            sum2-=customers[l];
            l++;
            


          }
          max = Math.max(max,sum2);

        }
      
        return sum1+max;
    }

}