class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
               
      
        int res[] = new int[s.length()];
        for(int i = 0; i<s.length(); i++)
        {
               
        int count = 0;

          int row = startPos[0];
        int col = startPos[1];


            for(int j = i; j<s.length(); j++){
            char c = s.charAt(j);
            if(c == 'R') col++;
           else if(c == 'L') col--;
           else if(c == 'U') row--;
            else if(c == 'D') row++;
            if(row>=n|| col>=n || col<0 || row<0) break;
            count++;
            }
            res[i] = count;
        }
        return res;
    }
}