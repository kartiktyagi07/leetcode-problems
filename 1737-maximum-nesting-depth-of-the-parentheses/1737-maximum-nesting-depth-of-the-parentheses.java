class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                cnt++;
                if(cnt>max){
                    max=cnt;
                }
            }else if(ch==')'){
                cnt--;
            }
        }
        return max;
    }
}