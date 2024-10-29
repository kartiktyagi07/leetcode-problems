class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        per(ans,new ArrayList<>(),nums);
        return ans;
    }
    public static void per( List<List<Integer>> ans,ArrayList<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int number: nums){
            if(temp.contains(number)){
                continue;
            }
            temp.add(number);
            per(ans,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    
}