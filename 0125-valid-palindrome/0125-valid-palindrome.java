class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
         

        while(l<r)
        {
          char first = s.charAt(l);
          char last  = s.charAt(r);
          if(!Character.isLetterOrDigit(first))
          {
            l++;

          }
          else if(!Character.isLetterOrDigit(last))
          {
            r--;
          }
          else
          {
            if(Character.toLowerCase(first) != Character.toLowerCase(last))
            {
              return false;
            }
            l++;
            r--;
          }
        }
       return true; 
    }
}