class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length(); // Length of the input string
        int max = 0; // Stores the length of the longest valid window
        Map<Character, Integer> map = new HashMap<>(); // Frequency map for characters in current window
        int left = 0, right = 0; // Sliding window pointers

        while (right < n) {
            // Step 1: Add current character at 'right' into the map
            char add = s.charAt(right);
            map.put(add, map.getOrDefault(add, 0) + 1);

            // Step 2: Check if the current window is valid
            // A window is valid if: (window size - max char frequency) <= k
            // i.e., we can replace at most k characters to make all characters same
            while ((right - left + 1) - helper(map) > k) {
                // If not valid, shrink the window from the left
                char rem = s.charAt(left);
                if (map.get(rem) == 1) {
                    map.remove(rem);
                } else {
                    map.put(rem, map.get(rem) - 1);
                }
                left++; // move left pointer to shrink window
            }

            // Step 3: Update max length of valid window
            max = Math.max(max, right - left + 1);
            right++; // move right pointer to expand window
        }

        return max; // Return the max valid window length found
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
