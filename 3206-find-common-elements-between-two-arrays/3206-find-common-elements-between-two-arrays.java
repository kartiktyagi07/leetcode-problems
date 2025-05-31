class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i:nums1){
            list1.add(i);
        }
        for(int i:nums2){
            list2.add(i);
        }
        int cnt1=0;
        for(int i:list1){
            if(list2.contains(i)) cnt1++;
        }
        int cnt2=0;
        for(int i:list2){
            if(list1.contains(i)) cnt2++;
        }
        return new int[]{cnt1,cnt2};
    }
}