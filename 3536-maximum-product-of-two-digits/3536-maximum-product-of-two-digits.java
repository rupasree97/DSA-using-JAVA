class Solution {
    public int maxProduct(int n) {
   
       char s[] = String.valueOf(n).toCharArray();
       Arrays.sort(s);
       int res = s.length;
       return (s[res-2]-'0' )* (s[res-1] - '0');


    }
}