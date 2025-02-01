class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            int first=nums[i];
            int second=nums[i+1];
            if(first%2==0){
                if(second%2!=0){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(second%2==0){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isEven(int a){
        return a%2==0;
    }
    public static boolean isOdd(int a){
        return a%2!=0;
    }
}