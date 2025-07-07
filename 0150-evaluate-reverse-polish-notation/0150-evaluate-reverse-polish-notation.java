class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int val1 = st.pop();
                int val2 = st.pop();
                int temp = 0;
                if (s.equals("/")) {
                    temp = val2 / val1;
                } else if (s.equals("+")) {
                    temp = val1 + val2;
                } else if (s.equals("*")) {
                    temp = val1 * val2;
                } else {
                    temp = val2 - val1;
                }
                st.push(temp);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}