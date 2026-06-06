class Solution {
    public String reversePrefix(String s, int k) {
        
        if(s.length() == 1 || k==1) return s;
        String res = "";
        for(int i= k-1; i>=0; i--)
        {
             res+=(s.charAt(i));
             

        }
        int n = s.length();
        if(!s.isEmpty())
        {
            for(int i = k; i<n; i++)
            {
                res+=(s.charAt(i));
            }
        }

        return res;
    }
}