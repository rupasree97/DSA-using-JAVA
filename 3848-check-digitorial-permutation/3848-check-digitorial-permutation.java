class Solution {
    public boolean isDigitorialPermutation(int n) {
        String temp = String.valueOf(n);
         int sum = 0;
        for(char c : temp.toCharArray())
            {
                sum+= factorial(c-'0');
            }
        String res = String.valueOf(sum);
        if(res.length()!=temp.length()|| res.startsWith("0"))
            return false;
        char temparr[] = temp.toCharArray();
        char resarr[] = res.toCharArray();
        Arrays.sort(temparr);
        Arrays.sort(resarr);
        return Arrays.equals(temparr, resarr);
    }
    private int factorial(int d)
    {
        int fact = 1;
        for(int i = 2; i<=d;i++)
            {
                fact*=i;
       
            }
        return fact;
    }
}