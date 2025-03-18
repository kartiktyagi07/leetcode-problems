class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        // Brute force TC:O(N^2) SC:O(N)
        ArrayList<Integer> list=new ArrayList<>();
        LinkedList<Integer> temp=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                temp.add(i);
            }
        }
        while(temp.size()!=0){
            int val=temp.get(0);
            for(int i=0;i<nums.length;i++){
                int diff=Math.abs(i-val);
                if(diff<=k){
                    list.add(i);
                }
            }
            temp.remove(0);
        }
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        return uniqueList;





        // Method 2 Two Pointer Approach TC:O() SC:O()
        
    }
}