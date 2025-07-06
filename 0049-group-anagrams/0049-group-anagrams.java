class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        // Solution is correct but it gives TLE 

        // List<List<String>> list=new ArrayList<>();
        // boolean[] flag=new boolean[str.length];
        // Arrays.fill(flag,true);
        // for(int i=0;i<str.length;i++){
        //     if (!flag[i]) continue;
        //     ArrayList<String> temp=new ArrayList<>();
        //     flag[i]=false;
        //     temp.add(str[i]);
        //     for(int j=i+1;j<str.length;j++){
        //         if(flag[j] && isAnagram(str[i],str[j])){
        //             temp.add(str[j]);
        //             flag[j]=false;
        //         }
        //     }
        //     list.add(temp);
        // }
        // return list;

        // Optimized Code
        // For every string in the input, it converts it to character     array,   sorts it, and uses the sorted version as a unique key. If the key doesn't exist in the map, it creates a new list using computeIfAbsent, then adds the original string to the corresponding list.

        Map<String,List<String>> map=new HashMap<>();
        for(String s:str){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.computeIfAbsent(key,x->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public boolean isAnagram(String s,String t){
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