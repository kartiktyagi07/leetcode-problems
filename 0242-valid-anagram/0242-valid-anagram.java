class Solution {
    public boolean isAnagram(String s, String t) {
        // Brute Force 
        // Sort both the arrays and compare them

        if(s.length()!=t.length()) return false;
        char[] chars1=s.toCharArray();
        char[] chars2=t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String str1=new String(chars1);
        String str2=new String(chars2);
        return str1.equals(str2);
    }
}