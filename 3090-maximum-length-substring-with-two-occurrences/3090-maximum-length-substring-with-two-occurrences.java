class Solution {
    public int maximumLengthSubstring(String s) {

        int l = 0;
        int n = s.length();
        int max  = 0;
       int freq[] = new int[26];
        for(int r = 0; r<n;r++)
        {
            freq[s.charAt(r)-'a']++;
             while(freq[s.charAt(r)-'a']>2)
             {
                freq[s.charAt(l)-'a']--;
                l++;
             }
             max = Math.max(max,r-l+1);
        }
        return max;
    }
}