class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int n = landStartTime.length;

        int finish1 = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        { 
            finish1 = Math.min(finish1,landStartTime[i]+landDuration[i]);

        }
       int  m = waterStartTime.length;
        for(int i = 0; i<m;i++)
        {
            ans  = Math.min(ans,waterDuration[i] + Math.max(waterStartTime[i] , finish1));
        }
        finish1 = Integer.MAX_VALUE;
        for(int i = 0; i<m; i++)
        {
            finish1 = Math.min(finish1, waterDuration[i] + waterStartTime[i]);
        }
        for(int i = 0; i<n; i++)
        {
           ans = Math.min(ans,  landDuration[i] + Math.max(finish1, landStartTime[i]));
        }
        
       return ans;
    }
}