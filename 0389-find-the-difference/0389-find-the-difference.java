class Solution {
    public char findTheDifference(String s, String t) {
        int sum  = 0;
        int diff = 0;
        for(char c: s.toCharArray())
        {
            
            diff+=c-'a';
        }
        for(char ss: t.toCharArray())
        {
            sum+=ss-'a';
        }
        return(char)(sum-diff+'a');
    }
}