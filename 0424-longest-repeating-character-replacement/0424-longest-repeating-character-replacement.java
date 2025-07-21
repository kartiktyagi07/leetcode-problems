class Solution {
    public int characterReplacement(String s, int k) {
        // int n = s.length(); // Length of the input string
        // int max = 0; // Stores the length of the longest valid window
        // Map<Character, Integer> map = new HashMap<>(); // Frequency map for characters in current window
        // int left = 0, right = 0; // Sliding window pointers

        // while (right < n) {
        //     // Step 1: Add current character at 'right' into the map
        //     char add = s.charAt(right);
        //     map.put(add, map.getOrDefault(add, 0) + 1);

        //     // Step 2: Check if the current window is valid
        //     // A window is valid if: (window size - max char frequency) <= k
        //     // i.e., we can replace at most k characters to make all characters same
        //     while ((right - left + 1) - helper(map) > k) {
        //         // If not valid, shrink the window from the left
        //         char rem = s.charAt(left);
        //         if (map.get(rem) == 1) {
        //             map.remove(rem);
        //         } else {
        //             map.put(rem, map.get(rem) - 1);
        //         }
        //         left++; // move left pointer to shrink window
        //     }

        //     // Step 3: Update max length of valid window
        //     max = Math.max(max, right - left + 1);
        //     right++; // move right pointer to expand window
        // }

        // return max; // Return the max valid window length found 

        // Method 2
        int n = s.length(); // Length of the input string
        int l = 0, r = 0; // Sliding window pointers: left (l) and right (r)
        int[] alp = new int[26]; // Array to store frequency of characters (assuming uppercase A-Z)
        int maxi = 0; // Tracks the highest frequency of a single character in the current window
        int sum = 0; // Stores the maximum length of a valid window

        while (r < n) {
            // Step 1: Expand window by including character at 'r'
            alp[s.charAt(r) - 'A']++;

            // Step 2: Update max frequency of any character in the current window
            maxi = Math.max(maxi, alp[s.charAt(r) - 'A']);

            // Step 3: Check if the current window is valid
            // If more than 'k' replacements are needed, shrink from left
            while ((r - l + 1) - maxi > k) {
                alp[s.charAt(l) - 'A']--; // Remove character at left from window
                l++; // Move left pointer forward
            }

            // Step 4: Update max valid window size
            sum = Math.max(sum, r - l + 1);

            // Step 5: Move right pointer to expand window
            r++;
        }

        return sum; // Return the maximum length found

    }

    // Helper function to find the max frequency character in the map
    public int helper(Map<Character, Integer> map) {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }
        return max;
    }
}
