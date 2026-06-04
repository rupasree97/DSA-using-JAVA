class Solution {


    int waviness(int x)
    {
      String s = Integer.toString(x);
           int cnt = 0;
      for(int i = 1; i<s.length()-1; i++)
      {
            char curr = s.charAt(i);
          if((curr > s.charAt(i-1) && curr > s.charAt(i+1))   || (curr < s.charAt(i-1) && curr < s.charAt(i+1)))
          {
              cnt++;
          }
         
      }
       return cnt;
     
    }
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
     for(int i = num1; i<=num2;  i++)
     {
        ans+=waviness(i);
     }

     return ans;
    }
}