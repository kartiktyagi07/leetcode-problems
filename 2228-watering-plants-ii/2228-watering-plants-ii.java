class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int cnt=0;
        int n=plants.length;
        int s=0;
        int e=n-1;
        int orgA=capacityA;
        int orgB=capacityB;
        while(s<e){
            if(capacityA>=plants[s]){
                capacityA-=plants[s];
            }else{
                cnt++;
                capacityA=orgA-plants[s];
            }
            s++;
            if(capacityB>=plants[e]){
                capacityB-=plants[e];
            }else{
                cnt++;
                capacityB=orgB-plants[e];
            }
            e--;
            if(s==e){
                if(Math.max(capacityA,capacityB)<plants[s]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}