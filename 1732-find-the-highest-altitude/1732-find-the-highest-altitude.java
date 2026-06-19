class Solution {
    public int largestAltitude(int[] gain) {
        int h[] = new int[gain.length+1];
        h[0] = 0;
        int prev = gain[0];
        for(int i = 1; i<=gain.length; i++)
        {
            h[i]  = prev;
            if(i!=gain.length)
            prev += gain[i];
        }
        int max = 0;
       for(int i = 0; i<h.length; i++)
       {
              max= Math.max(h[i], max);
       } 
       return max;
    }
}