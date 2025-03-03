class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // METHOD 1 TC:O(N) SC:O(N)

        // ArrayList<Integer> small=new ArrayList<>();
        // ArrayList<Integer> large=new ArrayList<>();
        // int cnt=0;
        // for(int x:nums){
        //     if(x<pivot){
        //         small.add(x);
        //     }else if(x>pivot){
        //         large.add(x);
        //     }else{
        //         cnt++;
        //     }

        // }
        // int i=0;
        // while(i<small.size()){
        //     nums[i]=small.get(i);
        //     i++;
        // }
        // while(cnt>0){
        //     nums[i]=pivot;
        //     cnt--;
        //     i++;
        // }
        // int j=0;
        // while(j<large.size()){
        //     nums[i]=large.get(j);
        //     i++;
        //     j++;
        // }
        // return nums;


        // METHOD 2 TC:O(N) SC:O(1)
        int small=0;
        int equal=0;
        for(int x:nums){
            if(x<pivot){
                small++;
            }else if(x==pivot){
                equal++;
            }
        }
        int[] ans=new int[nums.length];
        int i=0;
        int j=small;
        int k=small+equal;
        for(int x:nums){
            if(x<pivot){
                ans[i]=x;
                i++;
            }else if(x>pivot){
                ans[k]=x;
                k++;
            }else{
                ans[j]=x;
                j++;
            }
        }
        return ans;
    }
}