class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return palindrome(s,0,s.length()-1);
    }
    public boolean palindrome(String s,int i,int j){
        if(i>j) return true;
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return palindrome(s,i+1,j-1);
    }
}