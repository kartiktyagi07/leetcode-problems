class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> large=new ArrayList<>();
        int cnt=0;
        for(int x:nums){
            if(x<pivot){
                small.add(x);
            }else if(x>pivot){
                large.add(x);
            }else{
                cnt++;
            }

        }
        int i=0;
        while(i<small.size()){
            nums[i]=small.get(i);
            i++;
        }
        while(cnt>0){
            nums[i]=pivot;
            cnt--;
            i++;
        }
        int j=0;
        while(j<large.size()){
            nums[i]=large.get(j);
            i++;
            j++;
        }
        return nums;
    }
}