class Solution {
    public boolean isAnagram(String s, String t) {
        // Brute Force
        
        // if(s.length()!=t.length()) return false;
        // char[] chars1=s.toCharArray();
        // char[] chars2=t.toCharArray();
        // Arrays.sort(chars1);
        // Arrays.sort(chars2);
        // String str1=new String(chars1);
        // String str2=new String(chars2);
        // return str1.equals(str2);

        // Using hashMap
        Map<Character,Integer> map1=new TreeMap<>();
        Map<Character,Integer> map2=new TreeMap<>();
        for(char x:s.toCharArray()){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray()){
            map2.put(x,map2.getOrDefault(x,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }else{
            return false;
        }

    }
}