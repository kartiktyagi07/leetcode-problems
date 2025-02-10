class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if('a'<=ch && 'z'>=ch){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        Collections.reverse(st);
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}