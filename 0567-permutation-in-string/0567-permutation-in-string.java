class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Using Map and StringBuilder TC:O(N)

        // if (s1.length() > s2.length()) return false;
        // int windowLen=s1.length();
        // int n=s2.length();
        // int right=0;
        // Map<Character,Integer> map1=new HashMap<>();
        // for(char ch:s1.toCharArray()){
        //     map1.put(ch,map1.getOrDefault(ch,0)+1);
        // }
        // StringBuilder sb=new StringBuilder();
        // while(right<n){
        //     sb.append(s2.charAt(right));
        //     while(!sb.isEmpty() && sb.length()>windowLen){
        //         sb.deleteCharAt(0);
        //     }
        //     if(windowLen==sb.length()){
        //         Map<Character,Integer> map2=new HashMap<>();
        //         for(int i=0;i<sb.length();i++){
        //             map2.put(sb.charAt(i),map2.getOrDefault(sb.charAt(i),0)+1);
        //         }
        //         if(map1.equals(map2)){
        //             return true;
        //         }
        //     }
        //     right++;
        // }
        // return false;




        // Using Arrays
        int ans=0;
        if(s1.length()>s2.length()) return false;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) return true;
        for(int i=s1.length();i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(freq1,freq2)) return true;
        }
        return false;
    }
}