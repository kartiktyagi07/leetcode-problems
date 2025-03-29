class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list=new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
            if(list.contains(sb.charAt(i)) && list.contains(sb.charAt(j))){
               char temp=sb.charAt(i);
               sb.setCharAt(i,sb.charAt(j));
               sb.setCharAt(j,temp);
               i++;
               j--;
            }else if(!list.contains(sb.charAt(i))){
                i++;
            }else if(!list.contains(sb.charAt(j))){
                j--;
            }
        }
        return sb.toString();
    }
}