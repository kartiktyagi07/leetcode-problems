class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // good question for basic understanding of countsort
        int max=Integer.MIN_VALUE;
        for(int x:arr1){
            if(x>max){
                max=x;
            }
        }
        int[] freq=new int[max+1];
        for(int x:arr1){
            freq[x]++;
        }
        int idx=0;
        for(int i=0;i<arr2.length;i++){
            while(freq[arr2[i]]>0){
                arr1[idx++]=arr2[i];
                freq[arr2[i]]--;
            }
        }
        for(int i=0;i<=max;i++){
            while(freq[i]>0){
                arr1[idx++]=i;
                freq[i]--;
            }
        }
        return arr1;
    }
}