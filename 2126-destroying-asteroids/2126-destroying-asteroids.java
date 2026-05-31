class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
         Arrays.sort(asteroids);
        long total = mass;
        for(int num : asteroids)
        {
            if(num > total)
             return false;
             total+=num;

        }


  return true;
        
    }
}