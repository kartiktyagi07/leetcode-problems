class Solution {
    public int maxDepth(String s) {
        // Normal Approach

        // int cnt=0;
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='('){
        //         cnt++;
        //         if(cnt>max){
        //             max=cnt;
        //         }
        //     }else if(ch==')'){
        //         cnt--;
        //     }
        // }
        // return max;


        Stack<Character> st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                max=Math.max(max,st.size());
            }else if(ch==')'){
                st.pop();
            }
        }
        return max;
    }
}