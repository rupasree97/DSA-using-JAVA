class Solution {
    public int maxProduct(int n) {
   
       char s[] = String.valueOf(n).toCharArray();
       Arrays.sort(s);
       int res = s.length;
       return Character.getNumericValue(s[res-2]) * Character.getNumericValue(s[res-1]);


    }
}