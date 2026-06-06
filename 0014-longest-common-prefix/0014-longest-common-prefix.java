class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        int preflen = prefix.length();
        int j = 0;
        for(int i = 1; i<strs.length; i++)
        {
            String s = strs[i];
            while( preflen > s.length() || !prefix.equals(s.substring(0, preflen)))
            {
                preflen--;
            
            if(preflen==0)
            return "";

            prefix = prefix.substring(0,  preflen);
        }
        }
         return prefix;

        
    }
}