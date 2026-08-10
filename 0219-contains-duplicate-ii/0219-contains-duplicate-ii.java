    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            int l = 0;
            int r = 0;
            int n = nums.length;
            HashSet<Integer> s= new HashSet<>();
           while(r<n)
           {
            if(s.contains(nums[r])){
             return true;
           }
            s.add(nums[r]);
            if(Math.abs(l-r)>=k)
            {
                s.remove(nums[l]);
                l++;
            
            }
            r++;
           }
           return false;

        }

    }