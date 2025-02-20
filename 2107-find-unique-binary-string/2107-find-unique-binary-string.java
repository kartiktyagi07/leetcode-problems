class Solution {
    public String findDifferentBinaryString(String[] nums) {
        //  BRUTE FORCE NOT SO OPTIMIZED CODE
        // ArrayList<String> list=new ArrayList<>(Arrays.asList(nums));
        // int len=nums[0].length();
        // int range=(int)Math.pow(2,len);
        // for(int i=0;i<range;i++){
        //     String str = String.format("%" + len + "s", Integer.toBinaryString(i)).replace(' ', '0');
        //     if(!list.contains(str)){
        //         return str;
        //     }
        // }
        // return "";




        // METHOD 2 OPTIMIZED CODE
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i].charAt(i)=='1' ? '0' : '1');
        }
        return sb.toString();
    }
}