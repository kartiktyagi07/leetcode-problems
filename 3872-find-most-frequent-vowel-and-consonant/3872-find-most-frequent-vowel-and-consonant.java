class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch - 'a']++;
        }
        int maxVowel = 0;
        int maxConsonent = 0;
        for(int i=0;i<26;i++){
            char ch = (char)(i + 'a');
            if("aeiou".indexOf(ch)!=-1){
                maxVowel = Math.max(maxVowel,freq[i]); 
            }else{
                maxConsonent = Math.max(maxConsonent,freq[i]);
            }
        }
        return maxVowel + maxConsonent;
    }
}