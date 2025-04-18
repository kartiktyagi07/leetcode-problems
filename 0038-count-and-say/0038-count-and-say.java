class Solution {
    public String countAndSay(int n) {
        return method(n);
    }
    public static String RLE(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int cnt=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                cnt++;
                i++;
            }
            sb.append(cnt);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static String method(int n){
        if(n==1){
            return "1";
        }
        String prev=method(n-1);
        return RLE(prev);
    }
}