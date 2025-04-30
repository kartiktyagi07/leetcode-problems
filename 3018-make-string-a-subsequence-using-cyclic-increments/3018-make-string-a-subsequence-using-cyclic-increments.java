class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            int first=str1.charAt(i)-'a';
            int second=str2.charAt(j)-'a';
            if(first==second || (first+1)%26==second){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j!=str2.length()){
            return false;
        }
        return true;
    }
}