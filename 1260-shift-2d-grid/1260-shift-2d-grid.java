class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        int arr[] = new int[total];
        int idx = 0;
        k = k%total;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[idx] = grid[i][j];
                idx++;
            }
        }
        int temp = 0;
       int r[] = new int[total];
        for(int i = 0; i<=total-1; i++)
        {
           temp = (i+k)%total;
           r[temp] = arr[i];
        }
        idx = 0;
        ArrayList<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i<m; i++)
        {
            ArrayList<Integer> row = new ArrayList<>();
          for(int j = 0; j<n; j++)
          {
              row.add(r[idx]);
              idx++;
          }
          l.add(row);
        }
    return l;
    }
}