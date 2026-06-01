class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0;
        int cnt = 0; 
        int n = cost.length;
        Arrays.sort(cost);
        int left = 0, right = n-1;
        while(left<=right)
        {
            int temp = cost[left];
            cost[left] = cost[right];
            cost[right] = temp;
            left++;
            right--;

             
        }
        for(int i = 0; i<n;i++)
        {
           cnt++;
           if(cnt!=3)
           {
            sum+=cost[i];
           }  
           else
           {
            cnt = 0;
           }

        }
        return sum;
    }
}