class Solution {
    public String removeOuterParentheses(String s) {
        // first of all create a stck to track the opening and closing bracket
        Stack<Character> st= new Stack<>();
        // build a sb for optimization
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                // agr phle se hi h koi to mtlb inner parentheses h to sb m add krdo
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
                // or push bhi krdo
                st.push(s.charAt(i));
            }else{
                // agr if nhi h yo sbse phle pop kro
                st.pop();
                // check the condition k ab bhi stack m h ya nhi agr h to append krdo vrna kch nhi 
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}