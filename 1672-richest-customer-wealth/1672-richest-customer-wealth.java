class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length-1;
        int m = accounts[0].length-1;
        int maxsum = 0;
        for(int i = 0; i<=n;i++)
        {
            int sum = 0;
            for(int j = 0; j<=m;j++)
            { 
                sum+=accounts[i][j];
                
            }
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }
}