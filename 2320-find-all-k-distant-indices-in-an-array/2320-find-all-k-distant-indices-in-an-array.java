class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        // Brute force TC:O(N^2) SC:O(N)

        // ArrayList<Integer> list=new ArrayList<>();
        // LinkedList<Integer> temp=new LinkedList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==key){
        //         temp.add(i);
        //     }
        // }
        // while(temp.size()!=0){
        //     int val=temp.get(0);
        //     for(int i=0;i<nums.length;i++){
        //         int diff=Math.abs(i-val);
        //         if(diff<=k){
        //             list.add(i);
        //         }
        //     }
        //     temp.remove(0);
        // }
        // List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        // return uniqueList;


        // Two Pointer Approach TC:O(N);
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                list.add(i);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int j=0;
        for(int i=0;i<n;i++){
            while(j<list.size() && list.get(j)<i-k){
                j++;
            }
            if(j<list.size() && Math.abs(list.get(j)-i)<=k){
                ans.add(i);
            }
        }
        return ans;
    }
}