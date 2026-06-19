class Solution {
    public String restoreString(String s, int[] indices) {
        char res[] = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        for(int i  = 0; i<s.length(); i++)
        {
            res[indices[i]] = s.charAt(i);

            
        }
       sb.append(res);
        return sb.toString();
    }
}