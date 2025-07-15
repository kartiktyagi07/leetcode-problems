class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        if(!word.matches("[a-zA-Z0-9]+")) return false;
        boolean hasVowel=false;
        boolean hasConsonant=false;
        String vowels = "aeiouAEIOU";
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch)!=-1){
                    hasVowel=true;
                }else{
                    hasConsonant=true;
                }
            }
            if(hasVowel && hasConsonant) return true;
        }
        return false;
    }
}