class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(check(words[i],words[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static boolean check(String str1,String str2){
        int n=str1.length();
        if(n>str2.length()){
            return false;
        }
        String start=str2.substring(0,n);
        String end=str2.substring(str2.length()-n);
        return str1.equals(start) && str1.equals(end);
    }

}