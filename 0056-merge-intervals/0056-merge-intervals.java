class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[][] result=new int[intervals.length][2];
        int idx=0;
        for(int i=0;i<intervals.length;i++){
            if(idx==0 || result[idx-1][1]<intervals[i][0]){
                result[idx]=intervals[i];
                idx++;
            }else{
                result[idx-1][1]=Math.max(result[idx-1][1],intervals[i][1]);
            }
        }
        return Arrays.copyOf(result, idx);
    } 
}