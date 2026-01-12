class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        List<Integer>[] bucket = new List[nums.length+1];
        Map <Integer,Integer> frequencymap = new HashMap<Integer,Integer>();
        for(int num:nums)
        {
            frequencymap.put(num,frequencymap.getOrDefault(num,0)+1);
        }
        for(int key:frequencymap.keySet())
        {
            int frequency = frequencymap.get(key);
            if(bucket[frequency]==null)
            {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);

        }
        int res[] = new int[k];
        int idx =0;

        for(int i = bucket.length-1; i>=0&& idx<k; i--)
        {
            if(bucket[i]!=null)
            {
            for(int n:bucket[i])
                 {
                    res[idx++] = n;
                  if(idx==k) break;
                 }
            }

        }

        return res;
    }
}