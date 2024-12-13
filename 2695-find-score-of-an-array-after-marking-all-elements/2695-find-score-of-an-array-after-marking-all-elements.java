class Solution {
        //    METHOD 1-BRUTE FORCE
        //   GIVES TLE ONLY 8 CASES ARE LEFT
    // public long findScore(int[] nums) {
    //     int n=nums.length;
    //     long score=0;
    //     boolean arr[]=new boolean[n];
    //     while(true){
    //         int min=smallest(nums,arr);
    //         if(min==Integer.MAX_VALUE){
    //             break;
    //         }
    //         score=score+min;
    //     }
    //     return score;
    // }
    // public static int smallest(int[] array,boolean[] arr){
    //     int min=Integer.MAX_VALUE;
    //     int idx=-1;
    //     for(int i=0;i<array.length;i++){
    //         if(!arr[i] && array[i]<min){
    //             min=array[i];
    //             idx=i;
    //         }
    //     }
    //     if(idx==-1){
    //         return Integer.MAX_VALUE;
    //     }
    //     arr[idx]=true;
    //     if(idx-1>=0){
    //         arr[idx-1]=true;
    //     }
    //     if(idx+1<arr.length){
    //         arr[idx+1]=true;
    //     }
    //     return min;
    // }



    // METHOD 2 
    // AFTER SORTING THE ARRAY
    public long findScore(int[] nums){
        int n=nums.length;
        long score=0;
        boolean arr[]=new boolean[n];
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));
        for(int idx:indices){
            if(arr[idx]){
                continue;
            }
            score+=nums[idx];
            arr[idx]=true;
            if(idx-1>=0){
                arr[idx-1]=true;
            }
            if(idx+1<n){
                arr[idx+1]=true;
            }
        }
        return score;
    }   

}