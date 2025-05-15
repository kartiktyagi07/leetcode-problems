class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list=new ArrayList<>();
        if(words.length==0) return list;
        list.add(words[0]);
        int last=groups[0];
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=last){
                list.add(words[i]);
                last=groups[i];
            }
        }
        return list;
    }
}