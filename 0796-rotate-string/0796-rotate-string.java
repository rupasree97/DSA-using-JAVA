class Solution {
    public boolean rotateString(String s, String goal) {

                String ch = s + s;
                if(s.length() != goal.length())
                return false;
                if(ch.contains(goal))
                {
                    return true;
                }
                else
                {
                    return false;
                }
        
    }
}