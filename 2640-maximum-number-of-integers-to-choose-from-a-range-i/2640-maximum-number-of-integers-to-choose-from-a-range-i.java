class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int cnt=0;
        int sum=0;
        Set<Integer> hs=new HashSet<>();
        for(int num:banned){
            hs.add(num);
        }
        for(int i=1;i<=n;i++){
            if(hs.contains(i)){
                continue;
            }
            if(sum+i>maxSum){
               break;
            }
            sum=sum+i;
            cnt++;
        }
        return cnt;
    }
}