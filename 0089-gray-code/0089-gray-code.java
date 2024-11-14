class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<String> res=soln(n);
        List<Integer> integerList = new ArrayList<>();
        for (String str : res) {
            integerList.add(Integer.parseInt(str,2));
        }
        return integerList;
    }
    public static ArrayList<String> soln(int n){
        if(n==1){
            ArrayList<String> bref=new ArrayList<>();
            bref.add("0");
            bref.add("1");
            return bref;
        }
        ArrayList<String> temp=soln(n-1);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<temp.size();i++){
            String str=temp.get(i);
            ans.add("0" + str);
        }
        for(int i=temp.size()-1;i>=0;i--){
            String str=temp.get(i);
            ans.add("1" + str);
        }
        return ans;
    }
    
}