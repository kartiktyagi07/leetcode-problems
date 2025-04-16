class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        // Method 1 using map but it is wrong because map overrides the previous
        // value so thats why we cant use it in case of duplicates but for non
        // duplicy it will work absolutely fine

        // Map<Integer,Integer> map=new LinkedHashMap<>();
        // int[] ans=new int[nums.length];
        // for(int i=0;i<ans.length;i++){
        //     int num=nums[i];
        //     map.put(num,mapped(num,mapping));
        // }
        // List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        // list.sort(Comparator.comparingInt(Map.Entry::getValue));
        // int i=0;
        // for(Map.Entry<Integer,Integer> entry:list){
        //     ans[i++]=entry.getKey();
        // }
        // return ans;





        // Method 2 using list to store duplicates also
        int[] ans=new int[nums.length];
        // Create a list of arrays to store original as well as mapped value
        List<int[]> list=new ArrayList<>();
        // Fill the list
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            list.add(new int[]{num,mapped(num,mapping)});
        }
        // Sort the list with the help of comparator
        list.sort((a,b)->Integer.compare(a[1],b[1]));
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i)[0];
        }
        return ans;
    }
    public static int mapped(int x,int[] mapping){
        if(x==0) return mapping[0];
        int res=0;
        int pow=1;
        while(x!=0){
            res+=(mapping[x%10])*pow;
            x=x/10;
            pow=pow*10;
        }
        return res;
    }
}