class Solution {
    public long pickGifts(int[] gifts, int k) {
        int idx=0;
        int max=0;
        while(k>0){
            for(int i=0;i<gifts.length;i++){
                if(gifts[i]>max){
                    max=gifts[i];
                    idx=i;
                }
            }
            gifts[idx]=(int)Math.floor(Math.sqrt(max));
            k--;
            max=0;
        }
        long sum=0;
        for(int i=0;i<gifts.length;i++){
            sum+=gifts[i];
        }
        return sum;
    }
}