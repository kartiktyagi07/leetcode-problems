class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int res=nums[i]*nums[j];
                hmap.put(res,hmap.getOrDefault(res,0)+1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> x:hmap.entrySet()){
            int temp=x.getValue();
            if(temp>=2){
                int com=(temp*(temp-1))/2;
                ans=ans+com*8;
            }
        }
        return ans;
    }
}