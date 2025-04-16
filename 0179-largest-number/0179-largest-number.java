class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sb=new StringBuilder();
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        list.sort((a,b)->(b+""+a).compareTo(a+""+b));
        if(list.get(0)==0) return "0";
        for(int x:list){
            sb.append(x);
        }
        return sb.toString();
    }
}