class Solution {
    public int minBitFlips(int start, int goal) {
        int num=start^goal;
        int cnt=0;
        String str=Integer.toBinaryString(num);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') cnt++;
        }
        return cnt;
    }
}