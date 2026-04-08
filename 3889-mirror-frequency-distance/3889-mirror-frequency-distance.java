class Solution {
    public int mirrorFrequency(String s) {
        long freq[] = new long[128];
        for(int i = 0; i<s.length(); i++)
            {
                freq[s.charAt(i)]++;
            }
        boolean visited[] = new boolean[128];
        int sum = 0;
        for(int i = 0; i<128; i++)
            {
                if(!visited[i] && freq[i] > 0)
                {
                     char c = (char) i;
                    char m;
                    if(Character.isDigit(c))
                    {
                        m = (char)('0' + ('9' - c));
                        
                    }
                    else
                    {
                        m = (char) ('a' + ('z' - c));                    }
                
                sum += Math.abs(freq[c] - freq[m]);
                visited[c] = true;
                visited[m] = true;
            }
            }
        return sum;
    }
}