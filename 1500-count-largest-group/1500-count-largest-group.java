class Solution {
    public int countLargestGroup(int n) {
        int cnt=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            if(i<10){
                map.put(i,1);
            }else{
                int ds=digitSum(i);
                map.put(ds,map.getOrDefault(ds,0)+1);
            }
        }
        int max = Collections.max(map.values());
        for(int val:map.values()){
            if(val==max){
                cnt++;
            }
        }
        return cnt;
    }
    public static int digitSum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n=n/10;
        }
        return sum;
    }
}