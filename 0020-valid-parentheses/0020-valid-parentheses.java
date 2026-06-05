class Solution {
    public boolean isValid(String s) {
       Stack <Character> p = new Stack<>();
       for(int i = 0; i<s.length(); i++)
       {
       if(s.charAt(i) == '(')
       p.push(s.charAt(i));
       else if(s.charAt(i) == '{')
       p.push(s.charAt(i));
       else if(s.charAt(i) == '[')
       p.push(s.charAt(i));
       else
       {
        if(p.isEmpty())
        return false;
       
       
      else if(s.charAt(i) == '}' && !p.isEmpty() )
       {
        if(p.peek() == '{' )
           p.pop();
        else
        return false;
       }
     else  if(s.charAt(i) == ']' && !p.isEmpty())
       {
        if(p.peek() == '[')
           p.pop();
           else
           return false;
       }

      else  if(s.charAt(i) == ')' && !p.isEmpty())
      {
        if(p.peek() == '(')
          p.pop();
          else
          return false;
      }
       }
       }

     return p.isEmpty();
    }
}