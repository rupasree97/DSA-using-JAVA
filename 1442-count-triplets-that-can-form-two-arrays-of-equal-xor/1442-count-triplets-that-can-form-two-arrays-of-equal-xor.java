class Solution {
    public int countTriplets(int[] arr) {
     
        int prefix[] = new int[arr.length+1];
        prefix[0] = 0;
        for(int i = 1; i<=arr.length;i++)
        {
             prefix[i] = prefix[i-1] ^ arr[i-1];
        }
        int count = 0;
        for(int i = 0; i<=arr.length-1;i++)
        {
            
            for(int k = i+1;k<=arr.length;k++)
            {
                  if(prefix[i] == prefix[k])
                     count+=(k-i-1);
            }
        }

        return count;


    }
}