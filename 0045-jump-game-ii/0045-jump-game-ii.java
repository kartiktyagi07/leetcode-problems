class Solution {
    public int jump(int[] num) {
        int count = 0;           
        int maxjump = 0;
        int lastjump = 0;
        for (int i = 0; i < num.length - 1; i++){
            maxjump=Math.max(maxjump,i+num[i]);
            if(lastjump==i){
                count++;
                lastjump=maxjump;
                if(maxjump>=num.length-1){
                    break;
                }
            }
        }
        return count;
    }
}