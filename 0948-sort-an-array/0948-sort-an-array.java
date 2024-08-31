class Solution {
    public int[] sortArray(int[] nums) {
     merge(nums,0,nums.length);
     return nums;   
    }
    static void merge(int[] arr,int s,int e){
        if(e-s<=1) return;
        int mid=(e+s)/2;
        merge(arr,s,mid);
        merge(arr,mid,e);
        mix(arr,s,mid,e);
    }
    static void mix(int[] arr,int s,int m,int e){
        int[] ans=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<=arr[j]){
                ans[k]=arr[i];
                i++;
            }else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            ans[k]=arr[j];
            j++;
            k++;
        }
        for(int x=0;x<ans.length;x++){
            arr[s+x]=ans[x];
        }
    }
}