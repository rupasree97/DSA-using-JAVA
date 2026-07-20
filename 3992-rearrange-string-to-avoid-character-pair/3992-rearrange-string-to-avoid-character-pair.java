class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder yb = new StringBuilder();
        StringBuilder xb = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for(int i = 0; i<s.length(); i++)
        {
             char c = s.charAt(i);
            if(c == y)
            {
                yb.append(c);
            }
           else if(c == x)
            {
                xb.append(c);
            }
            else
            {
                others.append(c);
            } 
        }
        return yb.toString()+others.toString()+xb.toString();
    }
}