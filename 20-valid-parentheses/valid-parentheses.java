class Solution {
    public boolean isValid(String s) {
       //[] () {}  top= [,( ,{ // remaining ] , ),} 
       //[) //returns false
       Stack <Character> stack = new Stack<>(); //stack initialization
       for(char ch: s.toCharArray())
       {
           if(ch  =='(' || ch =='{' || ch == '[')
           {
                stack.push(ch);
           }
           else
           {
            if(stack.isEmpty())
            {
                return false;
            }
            char top = stack.pop();
            if(ch==')' && top!='(')
            {
                return false;
            }
            if(ch=='}' && top!='{')
            {
                return false;
            }
            if(ch==']' && top!='[')
            {
                return false;
            }


           }

       }

    return stack.isEmpty();
        
    }
}