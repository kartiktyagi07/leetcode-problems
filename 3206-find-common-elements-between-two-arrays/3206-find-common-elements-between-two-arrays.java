class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // Brute Force TC:O(n1*n2) coz contains take O(n) for look up SC:O(n1+n2)
        // nx=numsx.length;

        // ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<Integer> list2=new ArrayList<>();
        // for(int i:nums1){
        //     list1.add(i);
        // }
        // for(int i:nums2){
        //     list2.add(i);
        // }
        // int cnt1=0;
        // for(int i:list1){
        //     if(list2.contains(i)) cnt1++;
        // }
        // int cnt2=0;
        // for(int i:list2){
        //     if(list1.contains(i)) cnt2++;
        // }
        // return new int[]{cnt1,cnt2};


        // Optimized using Hashing coz in hashSet leekup operation is O(1)
        // TC:O(n1 + n2) SC:O(n1 + n2)

        // HashMap<Integer,Integer> map1=new HashMap<>();
        // HashMap<Integer,Integer> map2=new HashMap<>();
        // for(int i=0;i<nums1.length;i++){
        //     map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        // }
        // for(int i=0;i<nums2.length;i++){
        //     map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        // }
        // int cnt1=0;
        // for(int i:map2.keySet()){
        //     if(map1.containsKey(i)) cnt1+=map1.get(i);
        // }
        // int cnt2=0;
        // for(int i:map1.keySet()){
        //     if(map2.containsKey(i)) cnt2+=map2.get(i);
        // }
        // return new int[]{cnt1,cnt2};

        // Using HashSet 
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        int cnt1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                cnt1++;
            }
        }

        int cnt2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) {
                cnt2++;
            }
        }

        return new int[]{cnt1, cnt2};
    }
}