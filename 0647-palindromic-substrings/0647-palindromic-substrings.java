class Solution {
    public int countSubstrings(String s) {
       int cnt=0;
       for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            if(isPalindrome(s.substring(i,j))){
                cnt++;
            }
        }
       }
       return cnt;
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    } 
}