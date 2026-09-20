class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i = 0;i<s.length();i++)
        {
            int c = 'z' - s.charAt(i)+1;
        
             res += (i+1)*c;
            
        }
        return res;
    }
}