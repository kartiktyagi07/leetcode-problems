class Solution {
    public boolean validPalindrome(String s) {
        if(s.length()<=2){
            return true;
        }
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return check(s,i+1,j) || check(s,i,j-1);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static boolean check(String str,int s,int e){
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }else{
                s++;
                e--;
            }
        }
        return true;
    }
}