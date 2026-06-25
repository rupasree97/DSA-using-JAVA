class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i = 0; i<nums.size(); i++)
        {
                boolean flag[] = new boolean[101];
                int count = 0;
            for(int j = i; j<nums.size(); j++)
            {
              int curr = nums.get(j);
              if(!flag[curr])
              {
                flag[curr] = true;
                count++;
              }
              sum += count * count;
            }
         
         }
         return sum;
        
    }
}