class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0; i<=s.length()-2; i++)
        {
            
             sum+=Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        return sum;
    }
}