class Solution {
    public String minWindow(String s, String t) {
        // Optimized Solution TC:O(m+n)
        int m = s.length();
        int n = t.length();
        if (n > m) return "";         // if t is longer than s → impossible
        if (s.equals(t)) return s;    // quick check: both strings equal

        String ans = "";
        Map<Character, Integer> map = new HashMap<>();
        
        // Step 1: build frequency map for all characters in t
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int minLen = Integer.MAX_VALUE; // length of best window
        int count = 0;                  // how many chars of t are satisfied
        int i = 0, j = 0;                // window pointers

        // Step 2: expand window using j (right pointer)
        while (j < m) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1); // decrease needed count
                if (map.get(ch) >= 0) {
                    count++; // matched a required character
                }
            }

            // Step 3: shrink window from left (i) while it's valid
            while (count == n) { // all chars matched
                if (j - i + 1 < minLen) {       // update best answer
                    minLen = j - i + 1;
                    ans = s.substring(i, j + 1);
                }

                // remove char at left (i) from window
                char leftChar = s.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count--; // now missing one char → window invalid
                    }
                }
                i++; // shrink left
            }

            j++; // always expand right
        }
        return ans;
























        // Brute Force TC:O(n^3) approx gives TLE

        // int m=s.length();
        // int n=t.length();
        // if(n>m) return "";
        // if(s.equals(t)) return s;
        // String ans = "";
        // int minLen=Integer.MAX_VALUE;
        // for(int i=0;i<m;i++){
        //     for(int j=i;j<m;j++){
        //         String subStr = s.substring(i,j+1);
        //         if(helper(subStr,t)){
        //             if(subStr.length()<minLen){
        //                 ans=subStr;
        //                 minLen=subStr.length();
        //             }
        //         }
        //     }
        // }
        // return ans;
    }

    // public boolean helper(String str,String t){
    //     int[] freq=new int[128];
    //     for(char ch:t.toCharArray()){
    //         freq[ch]++;
    //     }
    //     for(char ch:str.toCharArray()){
    //         freq[ch]--;
    //     }
    //     for(int f:freq){
    //         if(f>0) return false;
    //     }
    //     return true;

    // }
}