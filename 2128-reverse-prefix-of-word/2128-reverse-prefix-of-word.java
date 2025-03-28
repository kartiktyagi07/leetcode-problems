class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        int s=0;
        StringBuilder sb=new StringBuilder(word);
        while(s<idx){
            char temp=sb.charAt(s);
            sb.setCharAt(s,sb.charAt(idx));
            sb.setCharAt(idx,temp);
            s++;
            idx--;
        }
        return sb.toString();
    }
}