class Solution {
    public int myAtoi(String s) {
    if(s.length()==0 || s==null)
    return 0;
    int min = Integer.MIN_VALUE;
    int max  = Integer.MAX_VALUE;
    int i = 0;
    long res = 0;
    while(i<s.length() && s.charAt(i)==' ')
    {
    i++;
    }
    if(i==s.length())
    return 0;
    int sign = 1;
    if(s.charAt(i) == '+')
     {
        i++;
     }
     else if(s.charAt(i) =='-')
     {
        sign = -1;
        i++;
     }
     while(i<s.length() && Character.isDigit(s.charAt(i)))
     {
          int digit = s.charAt(i) - '0';
          res = res * 10+ digit;
          if(sign * res<=min)
          {
            return min;
          }
          if(sign * res >=max)
          {
            return max;
          }
          i++;
     }

    return (int)( sign*res);    
        
    }
}