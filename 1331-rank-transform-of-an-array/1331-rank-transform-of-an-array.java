class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            temp[i] = arr[i];

        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> hs = new HashMap<>();
        int rank = 1;
        for(int i = 0; i<temp.length; i++)
        {
            if(!hs.containsKey(temp[i]))
            {
                hs.put(temp[i], rank);
                rank++;
            }


        }
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = hs.get(arr[i]);
         }
        return arr;

    }
}