class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char first=s.charAt(i);
            char last=s.charAt(j);
            if(first!=last){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}