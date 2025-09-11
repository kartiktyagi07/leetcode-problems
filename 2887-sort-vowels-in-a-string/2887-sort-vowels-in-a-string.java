class Solution {
    public String sortVowels(String s) {
        // Approach 1 TC: WC:O(nlogn),BC:O(n) SC:O(n)
        
        List<Integer> index = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                index.add(i);
                vowels.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        Collections.sort(vowels);
        int idx = 0;
        for(int i=0;i<index.size();i++){
            sb.setCharAt(index.get(i),vowels.get(idx));
            idx++;
        }
        return sb.toString();
    }
}