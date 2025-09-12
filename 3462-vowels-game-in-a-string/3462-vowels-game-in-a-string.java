class Solution {
    public boolean doesAliceWin(String s) {
        // Alice wins if and only if there is at least one vowel in the string.
        // Reason: she can always remove a substring with exactly 1 vowel (odd),
        // leaving Bob without a valid move eventually.
        
        // Traverse each character in the string
        for (char ch : s.toCharArray()) {
            // Check if the current character is a vowel
            if ("aeiou".indexOf(ch) != -1) {
                // Found a vowel → Alice has at least one valid move
                return true;
            }
        }
        
        // No vowels found → Alice cannot make a move → she loses
        return false;
    }
}
