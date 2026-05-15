class Solution {
    public int longestPalindrome(String s) {

HashMap<Character,Integer> hs = new HashMap<>();
for(char c: s.toCharArray())
{
     hs.put(c, hs.getOrDefault(c,0)+1);
}
int length = 0;
boolean hasodd = false;
for(int count :hs.values() )
{
    if(count%2==0)
    {
        length+=count;
    }
    else
    {
        length+=count-1;
        hasodd = true;
    }
}
if(hasodd)
{
    length+=1;
}
   return length;    
}
}