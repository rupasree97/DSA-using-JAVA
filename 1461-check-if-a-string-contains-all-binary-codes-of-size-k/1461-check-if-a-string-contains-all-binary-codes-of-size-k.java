class Solution {
    public boolean hasAllCodes(String s, int k) {
    int n = (int)Math.pow(2,k);
    HashSet <String> set = new HashSet<>();
    for(int i = k; i<=s.length(); i++)
    {
        String str = s.substring(i-k,i);
        if(!set.contains(str))
        {
            set.add(str);
        }
        

    }
    if(set.size()==n)
      return true;        
    else
   return  false;
}
}