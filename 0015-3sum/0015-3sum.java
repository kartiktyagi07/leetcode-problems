class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Brute Force TC:O(N^3) Gives TLE

        // int n=nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(triplet);
        //                 set.add(triplet);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);



        // Optimized code TC:O(N^2) SC:O(N+M)

        // int n=nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     if(i>0 &&  nums[i]==nums[i-1]) continue;
        //     int tar=-nums[i];
        //     Map<Integer,Integer> map=new HashMap<>();
        //     for(int j=i+1;j<n;j++){
        //         int com=tar-nums[j];
        //         if(map.containsKey(com)){
        //             List<Integer> trip=Arrays.asList(nums[i],com,nums[j]);
        //             Collections.sort(trip);
        //             set.add(trip);
        //         }
        //         map.put(nums[j],j);
        //     }
        // }
        // return new ArrayList<>(set);





        // Two pointer Approach TC:O(N^2) SC:O(1+M)
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int tar=-nums[i];
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum==tar){
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }else if(sum<tar){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return list;
    }
    
}