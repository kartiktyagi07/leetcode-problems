class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq = new int[3];
        int left = 0;
        int ans = 0;
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'a']++;
            // Check if the current window has minimum requirement
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                // If s.substring(left, right+1) is valid, then 
                // every substring starting at 'left' and ending at 
                // index 'right', 'right+1', ..., 'n-1' is also valid 
                ans += n - right;
                // Shrink the window from the left to find the next valid start
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return ans;
    }
}