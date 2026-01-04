class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += helper(i);
        }
        return sum;
    }
    public int helper(int n){
        int currSum = 0;
        int cnt = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                int d1 = i;
                int d2 = n/i;
                if(d1 == d2){
                    cnt += 1;
                    currSum += d1;
                }else{
                    cnt += 2;
                    currSum += d1 + d2;
                }
                if(cnt > 4){
                    break;
                }
            }
        }
        return cnt == 4 ? currSum : 0;
    }
}