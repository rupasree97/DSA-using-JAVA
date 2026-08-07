class Solution {
    public int totalFruit(int[] fruits) {
        
        if(fruits.length == 1)
        return 1;
        
   
        int l = 0;
        int r = 0;
        int max = 0;
        int n = fruits.length;
        HashMap<Integer,Integer> h = new HashMap<>();
      

        while(r<n)
        {
           
         h.put(fruits[r], h.getOrDefault(fruits[r],0)+1);
        
          while(h.size()>=3)
          {
         h.put(fruits[l], h.get(fruits[l]) -1 );
         if(h.get(fruits[l]) == 0)
            h.remove(fruits[l]);
         
         l++;

          }
          max = Math.max(max,r-l+1);
          r++;

         
        }
            
        
    return max;
    }
}
//      if(fruits[l]!=fruits[r])
        //      {
        //     if(k<2)
        //     {
            
        //      k++;
        //      count++;


        //     }
        //     else
        //     {
        //         l++;
            
        //     }

        //  }
        //     else
        //     {
        //         count++;
                

        //     }
        //    maxcount =  Math.max(count,maxcount);
        
        // }
        // return maxcount;