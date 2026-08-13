class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i= 0; i< (1 << n); i++) {

            List<Integer> subset = new ArrayList<>();

            for (int j = 0; j < n; j++) {

                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }

        
            Collections.sort(subset);
            set.add(subset);
        }

        return new ArrayList<>(set);
    }
}