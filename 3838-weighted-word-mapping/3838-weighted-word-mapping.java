class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s = new StringBuilder();
        for(String word: words)
        {
            int sum = 0;
            for(char w : word.toCharArray())
            {
                sum+= weights[w-'a'];
            }
            int mod = sum%26;
            char m = (char)('a'+(25-mod));
            s.append(m);
        }

        return s.toString();
    }
}