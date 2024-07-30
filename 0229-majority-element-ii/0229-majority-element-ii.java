class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        int val1=arr[0];
        int count1=1;
        int val2=arr[0];
        int count2=0;
        int i=1;
        while(i<arr.length){
            if(arr[i]==val1){
                count1++;
            }else if(arr[i]==val2){
                count2++;
            }else{
                if(count1==0){
                    val1=arr[i];
                    count1+=1;
                }else if(count2==0){
                    val2=arr[i];
                    count2+=1;
                }else{
                    count1--;
                    count2--;
                }
            }
            i++;
        }
        if(Func(arr,val1)==true){
            ans.add(val1);
        }
        if(val2!=val1&&Func(arr,val2)==true){
            ans.add(val2);
        }
        return ans;
    }
    public static boolean Func(int[] arr,int val){
        int count=0;
        for(int ele:arr){
            if(ele==val){
                count++;
            }
        }
        return count>arr.length/3;
    }
}