class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        ArrayList<String> list=new ArrayList<>();
        for(String x:arr){
            list.add(reverse(x));
        }
        return String.join(" ",list);
    }
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}