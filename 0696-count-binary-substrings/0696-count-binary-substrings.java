class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0, crnt_count = 1, res = 0;
        for(int i = 1; i<s.length(); i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                crnt_count++;
            }
            else
            {
                prev = crnt_count;
                crnt_count = 1;
            }
            if(crnt_count<=prev)
            {
                res++;
            }
        }
        return res;
       
       }        
    }
