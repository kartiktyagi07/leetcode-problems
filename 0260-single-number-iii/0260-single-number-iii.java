class Solution {
    public int[] singleNumber(int[] arr) {
        int[] ans=new int[2];
        int xor=0;
		for(int i=0;i<arr.length;i++){
			xor^=arr[i];
		}
		xor=xor&(-xor);
		for(int i=0;i<arr.length;i++){
			if((arr[i]&xor)==0){
				ans[0]^=arr[i];
			}else{
				ans[1]^=arr[i];
			}
		}
		return ans;
        
    }
}