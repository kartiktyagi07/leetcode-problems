class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        Arrays.sort(costs);
        int cnt=0;
        for(int x:costs){
            if(coins>=x){
                coins-=x;
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }
}