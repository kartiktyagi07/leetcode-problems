class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList(nums));
        int len=nums[0].length();
        int range=(int)Math.pow(2,len);
        for(int i=0;i<range;i++){
            String str = String.format("%" + len + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if(!list.contains(str)){
                return str;
            }
        }
        return "";
    }
}