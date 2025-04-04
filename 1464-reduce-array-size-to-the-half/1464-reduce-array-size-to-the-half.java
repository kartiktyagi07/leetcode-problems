class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        int[] freq=new int[max+1];
        for(int x:arr){
            freq[x]++;
        }
        Arrays.sort(freq);
        int cnt=0;
        int idx=freq.length-1;
        int remEle=0;
        int half=n/2;
        while((n-freq[idx])>half){
            cnt++;
            n=n-freq[idx];
            idx--;
        }
        return cnt+1;
    }
}