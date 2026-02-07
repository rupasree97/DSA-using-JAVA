class Solution {
    public int minimumDeletions(String s) {
        if(s.length() ==1)
        return 0;
        int bcount = 0;
        int minremovals = 0;
        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            bcount++;
            else if(bcount>0)
            {
            bcount--;
            minremovals++;
            }


        }
      return minremovals;  
    }
}