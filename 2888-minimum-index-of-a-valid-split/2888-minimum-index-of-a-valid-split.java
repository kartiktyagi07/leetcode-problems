class Solution {
    // It is correct but it gives tle for larger test cases
    // TC:O(N^2) SC:O(N)

    // public int minimumIndex(List<Integer> nums) {
    //     for (int i = 0; i < nums.size(); i++) {
    //         int fm = method(nums.subList(0, i + 1));
    //         int sm = method(nums.subList(i + 1, nums.size()));
    //         if (fm == sm)
    //             return i;
    //     }
    //     return -1;
    // }

    // public static int method(List<Integer> arr) {
    //     int s=arr.size()/2;
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int x : arr) {
    //         map.put(x,map.getOrDefault(x,0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //         if(entry.getValue()>s){
    //             return entry.getKey();
    //         }
    //     }
    //     return -1;
    // }


    // method 2 optimized approach 
    // TC:O(N) SC:O(1)
    public int minimumIndex(List<Integer> nums) {
        // Find global majority element by moore voting algo
        int ele=0;
        int cnt=0;
        for(int i=0;i<nums.size();i++){
            if(cnt==0){
                ele=nums.get(i);
            }
            if(nums.get(i)==ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        // Find the frequency of the majority element
        int freq=0;
        for(int x:nums){
            if(x==ele){
                freq++;
            }
        }
        // valid check
        if(freq*2<=nums.size()) return -1;
        // calculate frequencies in left and right subarrays
        int f1=0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==ele) f1++;
            int f2=freq-f1;
            if(f1*2>(i+1) && f2*2>(nums.size()-i-1)){
                return i;
            }
        }
        return -1;
    }
}