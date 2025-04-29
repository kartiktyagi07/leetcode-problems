class Solution {
    public String mergeAlternately(String words1, String words2) {
        // Create a stringbuilder because we need to modify it
        StringBuilder sb=new StringBuilder();
        // Set two pointers and a flag to balance between both strings
        int i=0;
        int j=0;
        boolean flag=true;
        while(i<words1.length() && j<words2.length()){
            if(flag){
                sb.append(words1.charAt(i));
                i++;
            }else{
                sb.append(words2.charAt(j));
                j++;
            }
            flag=!flag;
        }
        while(i<words1.length()){
            sb.append(words1.charAt(i));
            i++;
        }
        while(j<words2.length()){
            sb.append(words2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}