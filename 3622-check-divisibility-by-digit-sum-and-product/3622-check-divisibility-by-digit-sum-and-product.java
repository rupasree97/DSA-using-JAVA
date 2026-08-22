class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int t = n ;
        while(n>0)
        {
            int temp = n%10;
            sum+=temp;
            product*=temp;
            n = n/10;
        }
        
       return t%(sum+product)==0 ?true: false;

    }
}