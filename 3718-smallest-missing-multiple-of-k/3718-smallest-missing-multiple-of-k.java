class Solution {
    public int missingMultiple(int[] nums, int k) {
       
        HashSet<Integer> s = new HashSet<>();
         for(int n:nums)
         {
            s.add(n);
         }
         int ans = 0;
      
            for(int i = 1; i<=101;i++) {
            int temp = k*i;
            if(!s.contains(temp))
            {
                ans = temp;
                 return ans;
            }
        
         }
         return 0;
    }
}