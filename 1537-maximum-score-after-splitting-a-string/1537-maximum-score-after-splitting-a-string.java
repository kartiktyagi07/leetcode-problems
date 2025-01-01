class Solution {
    public int maxScore(String s) {
       int to=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            to++;
        }
       } 
       int tz=0;
       int ans=0;
       for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            tz++;
        }else{
            to--;
        }
        ans=Math.max(ans,tz+to);
       }
       return ans;
    }
}