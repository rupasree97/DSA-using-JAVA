class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        int res= s.charAt(0) - '0';
        if( res!=x && s.contains(String.valueOf( x) ))
        {
            return true;
        }
        return false;

    }
}