class Solution {
    public static boolean Issorted(int col, String[] str)
    {
        for(int i = 1; i<str.length;i++)
        {
            if(str[i].charAt(col) < str[i-1].charAt(col))
            return false;
        }
        return true;
    }
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for(int i = 0; i<strs[0].length();i++)
        {
            if(!Issorted(i,strs))
            {
                count++;
            }
        }
        return count;
        
    }
}