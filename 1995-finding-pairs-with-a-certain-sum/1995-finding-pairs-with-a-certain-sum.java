class FindSumPairs {
    int[] nums1,nums2;
    Map<Integer,Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        this.map=new HashMap<>();
        for(int num:nums2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal=nums2[index];
        int newVal=oldVal+val;
        map.put(oldVal,map.get(oldVal)-1);
        if(map.get(oldVal)==0){
            map.remove(oldVal);
        }
        map.put(newVal,map.getOrDefault(newVal,0)+1);
        nums2[index]+=val;
    }
    
    public int count(int tot) {
        int cnt=0;
        for(int num:nums1){
            int req=tot-num;
            cnt+=map.getOrDefault(req,0);
        }
        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */