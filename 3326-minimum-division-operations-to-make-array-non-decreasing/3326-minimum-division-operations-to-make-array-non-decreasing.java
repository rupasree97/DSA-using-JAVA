class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
     for(int i = nums.length-1; i>0;i--)
     {
        if(nums[i] < nums[i-1])
        {
           nums[i-1] = reduce(nums[i], nums[i-1]);
           if(nums[i-1] == -1) return -1;
           ans++;
            
        }
     }
     return ans;

    }
    private int reduce(int n1,int n2)
    {
        for(int i=2;i<=n1;i++)
        {
          if(n2%i==0) 
          return i;
        }
        return -1;
    }
} 