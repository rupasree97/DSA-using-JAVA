class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            long sum = 0;
            for(int j = i; j<n; j++)
            {
                
                sum+=nums[j];
                if(sum%10 == x)
                {
                   if(getdigit(sum) == x) 
                   {
                       count++;
                   }
                }
                
            }
        }
    

        return count;
    }
    private int getdigit(long n)
    {
        while(n>=10)
        n = n/10;

        return(int) n;
    }
}