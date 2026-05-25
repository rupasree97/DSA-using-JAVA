class Solution {
    public int passwordStrength(String password) {
        char[] arr = password.toCharArray();
        int points = 0;
        String set ="!@#$";
        HashSet <Character> seen = new HashSet<>();
        for(int i = 0; i<arr.length; i++)
            {
                
                if(seen.contains(arr[i]))
                    continue;

                seen.add(arr[i]);
                if(arr[i]>='a'&& arr[i]<='z')
                    points+=1;
                else if(arr[i] >='A' && arr[i]<= 'Z')
                    points+=2;
                else if(arr[i] >= '0' && arr[i]<='9')
                    points+=3;
                else if(set.indexOf(arr[i]) != -1)
                    points+=5;
            }
       return points; 
    }
}