class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
    int res = Integer.MAX_VALUE;
    int n = landStartTime.length;
    int m = waterStartTime.length;
    int landfinish = 0, finish1 = 0, waterfinish = 0,finish2 = 0;
    for(int i = 0; i<n; i++)
    {
        for(int j = 0; j<m; j++)
        {
            landfinish = landStartTime[i] + landDuration[i];
            finish1 = Math.max(waterStartTime[j] , landfinish) + waterDuration[j];
            res = Math.min(res,finish1);
            waterfinish = waterStartTime[j] + waterDuration[j];
            finish2 = Math.max(waterfinish, landStartTime[i])+landDuration[i];
            res = Math.min(finish2, res);



        }
    }
     return res;
        
    }
}