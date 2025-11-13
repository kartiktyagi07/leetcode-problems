class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(n>m) return "";
        if(s.equals(t)) return s;
        String ans = "";
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0,j=0,minLen=Integer.MAX_VALUE,cnt=0;
        while(j<m){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)>=0){
                    cnt++;
                }
            }
            while(cnt == n){
                if(j-i+1<minLen){
                    minLen = j-i+1;
                    ans = s.substring(i,j+1);
                }
                char leftChar = s.charAt(i);
                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0){
                        cnt--;
                    }
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}