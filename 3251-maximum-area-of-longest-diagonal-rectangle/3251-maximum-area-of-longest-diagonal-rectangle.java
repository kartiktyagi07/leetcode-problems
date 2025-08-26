class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal=0;
        int maxArea=0;
        for(int i=0;i<dimensions.length;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            int diag=(length*length)+(width*width);
            int area=length*width;
            if(diag>maxDiagonal){
                maxDiagonal=diag;
                maxArea=area;
            }else if(diag==maxDiagonal){
                maxArea=Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}