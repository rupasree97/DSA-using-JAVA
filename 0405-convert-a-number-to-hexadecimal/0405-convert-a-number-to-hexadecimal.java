class Solution {
    public String toHex(int num) {
        
        if(num == 0)
        return "0";
         String h = "0123456789abcdef";
         StringBuilder res = new StringBuilder();
            while(num!=0)
            {
              int   temp = num &15;
                
                 res.append(h.charAt(temp));
                 num = num>>>4;


            }
            return res.reverse().toString();

        
    }
}