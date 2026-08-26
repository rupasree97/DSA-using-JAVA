class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int ones = 0;
        int len  = 0;
        String ans = "";
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<s.length(); i++)
        {
            ones  = 0;
          for(int j = i; j<s.length();j++)
          {
               if(s.charAt(j)  == '1')
               {
                    ones++;
               }
               if(ones == k)
               {
                 len = j-i+1;
                String curr = s.substring(i,j+1);
                if(len<min)
                {
                    min = len;
                    ans = s.substring(i,j+1);
                }
               else if(len == min && curr.compareTo(ans)<0 )
                  {
                    ans = curr;
                  }

               }
               if(ones>k)
               break;
          }
        }
     return ans;
    }
}