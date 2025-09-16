class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i:nums){
            int val = i;
            while(!st.isEmpty() && findHCF(st.peek(),val)>1){
                val = findLCM(st.pop(),val);
            }
            st.push(val);
        }
        return new ArrayList<>(st);

    }
    public int findLCM(int a,int b){
        return (a/findHCF(a,b))*b;
    }
    public int findHCF(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp; 
        }
        return a;
    }
}