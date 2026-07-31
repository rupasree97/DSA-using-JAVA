class Solution {
    public String defangIPaddr(String address) {
        String res = "";
        for(char c:address.toCharArray())
        {
            if(c=='.')
            {
                res+="[.]";
            }
            else
            res+=c;
        }
        return res;
    }
}