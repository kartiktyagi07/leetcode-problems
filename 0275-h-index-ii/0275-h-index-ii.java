class Solution {
    public int hIndex(int[] citations) {
        int i=0;
        int n=citations.length;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(citations[mid]==n-mid){
                return n-mid;
            }else if(citations[mid]<n-mid){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return n-i;
    }
}