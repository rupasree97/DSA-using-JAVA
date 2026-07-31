class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for(int i =0 ; i<s.length();i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
            ch[i] = (char) (ch[i] + 32);
            }
        }
        return String.valueOf(ch);
    }
}