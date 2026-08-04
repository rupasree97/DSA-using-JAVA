class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(char c:s.toCharArray())
        {
             freq[c-'a'] ++;
        }
        int first = -1;
        for(int i = 0;i<s.length(); i++)
        {
            if(freq[s.charAt(i)-'a'] ==1)
            {
                first = i;
                break;
            }
        }
            return first;
    }
}