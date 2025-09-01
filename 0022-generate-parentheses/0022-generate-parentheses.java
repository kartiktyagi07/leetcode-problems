import java.util.*;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // start backtracking with empty string, 0 open and 0 close
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    /**
     * @param result -> stores all valid combinations
     * @param current -> current string being built
     * @param open -> number of '(' used so far
     * @param close -> number of ')' used so far
     * @param n -> total number of pairs of parentheses
     */
    private void backtrack(List<String> result, StringBuilder current, int open, int close, int n) {
        // ✅ Base case: if length is 2*n, we formed a valid parentheses string
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }

        // ✅ Option 1: Add '(' if we still have unused open brackets
        if (open < n) {
            current.append('('); // choose '('
            backtrack(result, current, open + 1, close, n); // explore
            current.deleteCharAt(current.length() - 1); // undo choice (backtrack)
        }

        // ✅ Option 2: Add ')' if we have unmatched '(' available
        if (close < open) {
            current.append(')'); // choose ')'
            backtrack(result, current, open, close + 1, n); // explore
            current.deleteCharAt(current.length() - 1); // undo choice (backtrack)
        }
    }
}
