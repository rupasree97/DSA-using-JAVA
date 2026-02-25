class Solution {
    public int[] sortByBits(int[] arr) {
        Integer []temp = new Integer[arr.length];
        for(int i = 0; i<arr.length;i++)
        {  temp[i] = arr[i];

        }
        Arrays.sort(temp, (a,b)->
        {
            int bcounta = Integer.bitCount(a);
            int bcountb = Integer.bitCount(b);
            if(bcounta==bcountb) return a-b;
            else
            return bcounta-bcountb;
        });
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = temp[i];
        }
        return arr;
    }
}