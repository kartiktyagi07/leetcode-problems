class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cnt=0;
        int n=plants.length;
        int currCapacity=capacity;
        for(int i=0;i<n;i++){
            if(currCapacity>=plants[i]){
                currCapacity-=plants[i];
                cnt++;
            }else{
                cnt+=2*i;
                currCapacity=capacity-plants[i];
                cnt++;
            }
        }
        return cnt;
    }
}