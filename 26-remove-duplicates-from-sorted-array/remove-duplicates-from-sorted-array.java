class Solution {
    public int removeDuplicates(int[] n) {
        if (n.length == 1) return 1;
        
        int i = 0; // Pointer for last unique element
        for (int j = 1; j < n.length; j++) {
            if (n[i] != n[j]) {
                n[i + 1] = n[j]; // Place next unique element
                i++;
            }
        }
        return i + 1; // Length of unique elements
    }
}