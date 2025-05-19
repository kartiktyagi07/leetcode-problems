class Solution {
    public String triangleType(int[] nums) {
        int n=nums.length;
        if(n<3) return "none";
        int a=nums[0],b=nums[1],c=nums[2];
        Set<Integer> set=new HashSet<>();
        if(a+b<=c || a+c<=b || b+c<=a) return "none";
        for(int x:nums){
            set.add(x);
        }
        if(set.size()==1) return "equilateral";
        else if(set.size()==2) return "isosceles";
        return "scalene";
    }
}