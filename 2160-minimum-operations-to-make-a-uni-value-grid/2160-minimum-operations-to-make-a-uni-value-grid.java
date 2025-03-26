class Solution {
    public int minOperations(int[][] grid, int x) {
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int ele=list.get(list.size()/2);
        for(int i=0;i<list.size();i++){
            int diff=Math.abs(list.get(i)-ele);
            if(diff%x!=0){
                return -1;
            }
            cnt+=diff/x;
        }
        return cnt;
    }
}