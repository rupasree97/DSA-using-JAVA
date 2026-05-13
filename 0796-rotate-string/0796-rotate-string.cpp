class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.length() != goal.length()) return false;
        else
        {
            return(s+s).contains(goal);
        }
    }
};