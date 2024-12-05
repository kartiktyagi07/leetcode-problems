class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int x=2*arr[i];
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid]==x && mid!=i){
                    return true;
                }else if(arr[mid]<x){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
        }
        return false;
    }
}