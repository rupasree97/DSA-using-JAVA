class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[] = new int[26];
        for(char c : ransomNote.toCharArray())
        {
            freq[c -'a']++;
        }
        for(char c: magazine.toCharArray())
        {
            if(freq[c-'a'] !=0)
            freq[c-'a'] --;
        }
            for(int i = 0; i<freq.length;i++)
            {
                if(freq[i]!=0)
                  return false;
            }
            return true;

    }
}