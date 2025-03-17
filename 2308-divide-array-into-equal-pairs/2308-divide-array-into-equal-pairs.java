class Solution {
    public boolean divideArray(int[] nums) {
        // Method 1 TC:O(N) SC:O(N)
        // Use a hashmap to store frequency if frequency is not even 
        // return false else return true

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Integer value:map.values()){
            if(value%2!=0){
                return false;
            }
        }
        return true;


        // Method 2
        // this xor approach fails beacuse [6,12,11,20,17,4] its xor=0 but we can
        // make valid pairs 

        // int xor=0;
        // for(int x:nums){
        //     xor^=x;
        // }
        // return xor==0;





    }
}