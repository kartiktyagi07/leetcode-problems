class Solution {
    public int minimumDeletions(String s) {
        // Method 2
        int bCnt = 0;
        int deletions = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                bCnt++;
            }else{
                // We found an 'a'. To keep the string balanced, we either:
                // 1. Delete this current 'a' (deletions + 1)
                // 2. Keep this 'a' and delete all previous 'b's (bCnt)
                deletions = Math.min(deletions+1,bCnt);
            }
        }
        return deletions;
    //     // Method 1
    //     int deletions = 0;
    //     Stack<Character> st = new Stack<>();
    //     for(char ch : s.toCharArray()){
    //         if(!st.isEmpty() && st.peek() == 'b' && ch == 'a'){
    //             st.pop();
    //             deletions++;
    //         }else{
    //             st.push(ch);
    //         }
    //     }
    //     return deletions;
    }
}