class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        // Brute Force Approach gives TLE
        // TC:O(N*time) SC:O(1)

        // int n=security.length;
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(i-time>=0 && i+time<n){
        //         if(checkBefore(i-time,i,security) && checkAfter(i,i+time,security)){
        //             list.add(i);
        //         }
        //     }
        // }
        // return list;



        // Optimized Approach
        int n=security.length;
        int[] left=new int[n];
        int[] right=new int[n];
        // Precompute the non-increasing array
        for(int i=1;i<n;i++){
            if(security[i]<=security[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        // Precompute the non-decreasing array
        for(int i=n-2;i>=0;i--){
            if(security[i]<=security[i+1]){
                right[i]=right[i+1]+1;
            }
        }
        // Compute the index in a final list
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(left[i]>=time && right[i]>=time){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean checkBefore(int i,int j,int[] security){
        for(int k=i;k<j;k++){
            if(security[k]<security[k+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkAfter(int i,int j,int[] security){
        for(int k=i;k<j;k++){
            if(security[k]>security[k+1]){
                return false;
            }
        }
        return true;
    }
}