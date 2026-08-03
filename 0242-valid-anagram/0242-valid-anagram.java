class Solution {
    public boolean isAnagram(String s, String t) {
        char[] res1 = s.toCharArray();
        char[] res2 = t.toCharArray();
        Arrays.sort(res1);
        Arrays.sort(res2);
        return Arrays.equals(res1,res2);
    }
}