class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        int idx=0;
        for(String a:words){
            if(a.indexOf(x)!=-1) list.add(idx);
            idx++;
        }
        return list;
    }
}