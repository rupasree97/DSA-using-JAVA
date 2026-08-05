class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int total = 1<<n;
        for(int i = 0; i<total;i++)
        {
           a.add(i^(i>>1));
        }
        return a;
    }
}