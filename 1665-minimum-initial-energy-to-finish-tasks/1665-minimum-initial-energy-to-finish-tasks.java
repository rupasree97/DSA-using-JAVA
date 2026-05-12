class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int ans = 0;
        int energy  = 0;
        for(int i = 0; i<tasks.length;i++)
    {
            int min = tasks[i][1];
            int actual = tasks[i][0];
            if(energy < min)
            {
                ans+=(min-energy);
                energy = min;
            }
            energy -= actual;
    }
      return ans;  
    }
}