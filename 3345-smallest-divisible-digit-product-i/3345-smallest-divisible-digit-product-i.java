class Solution {
    public int digits(int m)
    {   
        int ans = 1;
        while(m>0)
        {
        int temp = m%10;
        ans*=temp;
        m = m/10;

        }
        return ans;

    }
    public int smallestNumber(int n, int t) {
        
        int min = 0;
        for(int i = n; i<=100; i++)
        {
            int product = digits(i);
            if(product%t==0)
            { 
                  min = i;
               break;

            }
        }
        return min;
    }
}