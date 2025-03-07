class Solution {
    public int[] closestPrimes(int left, int high){
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=high){
            if(isPrime(left)){
                list.add(left);
            }
            left++;
        }
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<list.size()-1;i++){
            int diff=list.get(i+1)-list.get(i);
            if(diff<min){
                index=i;
                min=diff;
            }
        }
        return new int[]{list.get(index),list.get(index+1)};
    }
        
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}