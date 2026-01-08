class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();
        int idx = -1;
        for(int i=num.length()-1;i>=0;i--){
            int number = num.charAt(i) - '0';
            if(number % 2 != 0){
                idx = i;
                break; 
            }
        }
        if(idx == -1) return "";
        for(int i=0;i<=idx;i++){
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }
}