class Solution {
    public int minimumRecolors(String s, int k) {
        int left=0;
        int right=0;
        int wb=0;
        while(right<k){
            if(s.charAt(right)=='W'){
                wb++;
            }
            right++;
        }
        int min=wb;
        if(min==0){
            return 0;
        }
        for(left=1;right<s.length();left++,right++){
            if(s.charAt(left-1)=='W'){
                wb--;
            }
            if(s.charAt(right)=='W'){
                wb++;
            }
            min=Math.min(min,wb);
            if(min==0){
                return 0;
            }
        }
        return min;
    }
}