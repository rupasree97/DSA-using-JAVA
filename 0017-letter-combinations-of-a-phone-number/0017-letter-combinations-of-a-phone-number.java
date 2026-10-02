class Solution {
    void fun(int id,String digits, HashMap<Integer,String> h,ArrayList<String> res, StringBuilder r)
    {
       
        if(id == digits.length())
        {
            res.add(r.toString());
            return;

        }
        int d = digits.charAt(id) - '0';

        String letters = h.get(d);
        for(int i = 0; i<letters.length(); i++)
        {
           r.append(letters.charAt(i));
          fun(id+1,digits,h,res,r);
           r.deleteCharAt(r.length()-1);
        }

        

    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        ArrayList<String> res = new ArrayList<>();
        fun(0,digits,map,res,new StringBuilder());
        return res;

    }
}