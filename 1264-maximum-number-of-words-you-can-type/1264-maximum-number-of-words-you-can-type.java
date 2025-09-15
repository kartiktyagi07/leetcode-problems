class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int cnt = 0;
        String[] arr = text.split(" ");
        for(String x:arr){
            boolean flag = true;
            for(char ch:brokenLetters.toCharArray()){
                if(x.indexOf(ch)!=-1){
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        return cnt;
    }
}