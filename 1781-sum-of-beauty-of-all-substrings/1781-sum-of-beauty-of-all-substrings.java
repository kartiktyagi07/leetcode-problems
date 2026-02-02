class Solution {
    public int beautySum(String s) {
        // Brute Force
        int ans = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                ans += helper(s.substring(i,j));
            }
        }
        return ans;
    }
    public int helper(String str){
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i) - 'a';
            freq[idx]++;
        }
        Arrays.sort(freq);
        int min = 0;
        int max = 0;
        for(int i=0;i<26;i++){
            if(freq[i] != 0){
                min = freq[i];
                break;
            }
        }
        for(int i=25;i>=0;i--){
            if(freq[i] != 0){
                max = freq[i];
                break;
            }
        }
        return max - min;
    }
}