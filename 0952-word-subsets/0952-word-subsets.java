
    // public List<String> wordSubsets(String[] words1, String[] words2) {
            // APPROACH 1 || GIVE TLE  
        // ArrayList<String> list=new ArrayList<>();
        // for(int j=0;j<words1.length;j++){
        //     boolean flag=true;
        //     String x=words1[j];
        //     for(int i=0;i<words2.length;i++){
        //         if(!isSubset(x,words2[i])){
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         list.add(x);
        //     }
        // } 
        // return list;  

    // }  

    class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxCharFreq = new int[26];
        int[] tempCharFreq = new int[26];

        for (String word : words2) {
            Arrays.fill(tempCharFreq, 0);
            for (char ch : word.toCharArray()) {
                tempCharFreq[ch - 'a']++;
            }
            for (int i = 0; i < 26; ++i) {
                maxCharFreq[i] = Math.max(maxCharFreq[i], tempCharFreq[i]);
            }
        }

        List<String> universalWords = new ArrayList<>();

        for (String word : words1) {
            Arrays.fill(tempCharFreq, 0);
            for (char ch : word.toCharArray()) {
                tempCharFreq[ch - 'a']++;
            }

            boolean isUniversal = true;
            for (int i = 0; i < 26; ++i) {
                if (maxCharFreq[i] > tempCharFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                universalWords.add(word);
            }
        }

        return universalWords;
    }

}

    
    // private boolean isSubset(String word1, String word2) {
    //     int[] freq1 = new int[26];
    //     int[] freq2 = new int[26];
    //     for (int j = 0; j < word1.length(); j++) {
    //         freq1[word1.charAt(j) - 'a']++;
    //     }
    //     for (int j = 0; j < word2.length(); j++) {
    //         freq2[word2.charAt(j) - 'a']++;
    //     }
    //     for (int i = 0; i < 26; i++) {
    //         if (freq2[i] > freq1[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
