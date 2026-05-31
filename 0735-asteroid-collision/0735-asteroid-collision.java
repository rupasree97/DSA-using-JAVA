class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
            ArrayList <Integer> l = new ArrayList<>();
            for(int a : asteroids)
            {
                l.add(a);
            }
        
        boolean changed = true;
        while(changed)
        {
            changed = false;
            for(int i = 0; i<l.size()-1; i++)
            {
                int left = l.get(i);
                int right = l.get(i+1);
                 if(left>0 && right<0)
                 {
                      changed = true;
                    if(Math.abs(left) < Math.abs(right))
                    {
                         l.remove(i);
                    }
                    else if(Math.abs(left) > Math.abs(right))
                    {
                        l.remove(i+1);
                    }
                    else
                    {
                        l.remove(i+1);
                        l.remove(i);
                    }
                    break;
              }  

            }

        }
int res[] = new int[l.size()];
    for(int i = 0; i< l.size(); i++)
    {
        res[i] = l.get(i);
    }

   return res;
    }
}