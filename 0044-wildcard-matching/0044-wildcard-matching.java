class Solution {
    private boolean fun(String s,String p, int i, int j,Boolean[][] dp)
    {
        if(p.length() == j)
       {
        return s.length() == i;
       }
        if(dp[i][j]!= null)
        return dp[i][j];
        boolean take = false;
         boolean ans = false;
         // *  sequence
            if(j < p.length() && p.charAt(j) == '*' )
            {
             boolean leave =   fun(s,p,i,j+1,dp);
             if(i<s.length()) 
              take = fun(s,p,i+1,j,dp);
             ans = leave || take;
             dp[i][j] = ans;
             return ans;
            }
            //? character
         boolean res = i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?');
         if(res){
         ans =  fun(s,p,i+1,j+1,dp);
         dp[i][j] = ans;
         return ans;
         }
         else{
         dp[i][j] = false;
          return false;
         }     
       
  }
    public boolean isMatch(String s, String p) {
      Boolean[][] dp = new Boolean[s.length()+1][p.length()+1];
      return  fun(s,p,0,0,dp);
    }
}