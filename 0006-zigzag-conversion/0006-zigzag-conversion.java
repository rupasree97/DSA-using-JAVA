class Solution {
    public String convert(String s, int numRows) {
      ArrayList  <StringBuilder> s1 = new ArrayList<>();
      for(int i = 0; i<numRows; i++)
      {
        s1.add(new StringBuilder());
      }
      int curr = 0;
      int direction = 1;
      if (numRows == 1 || numRows >= s.length())
    return s;
      for(char c: s.toCharArray())
         {
        if(curr == numRows-1)
        {
         direction = -1;
        }
        if(curr == 0)
        {
           direction = 1;
        }
        s1.get(curr).append(c);
        curr+=direction;
    
        

      }
      StringBuilder res = new StringBuilder();
      for(StringBuilder row: s1)
      {
        res.append(row);
      }
      return res.toString();


        
    }
}