class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // TC:O(n1*n2)

        // int n1=nums1.length;
        // int n2=nums2.length;
        // int[] ans=new int[n1];
        // for(int i=0;i<n1;i++){
        //     ans[i]=-1;
        // }
        // for(int i=0;i<n1;i++){
        //     int idx=search(nums2,nums1[i]);
        //     for(int j=idx+1;j<n2;j++){
        //         if(nums2[j]>nums1[i]){
        //             ans[i]=nums2[j];
        //             break;
        //         }
        //     }
        // }
        // return ans;



        // Optmized Code TC:O(n1+n2)
        
        int n1=nums1.length;
        int n2=nums2.length;
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int[] ans=new int[n1];
        for(int i=0;i<n1;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
    public static int search(int[] nums,int ele){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                return i;
            }
        }
        return -1;
    }
}