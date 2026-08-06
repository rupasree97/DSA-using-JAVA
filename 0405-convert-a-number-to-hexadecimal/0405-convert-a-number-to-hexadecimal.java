class Solution {
    public String toHex(int num) {
        
        if(num == 0)
        return "0";
         char[] h = "0123456789abcdef".toCharArray();
         StringBuilder res = new StringBuilder();
            while(num!=0)
            {
              int   temp = num &15;
                
                 res.append(h[temp]);
                 num = num>>>4;


            }
            return res.reverse().toString();

        
    }
}