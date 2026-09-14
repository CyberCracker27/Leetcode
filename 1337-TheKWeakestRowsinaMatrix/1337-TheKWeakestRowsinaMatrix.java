// Last updated: 9/14/2026, 9:28:11 AM
1class Solution {
2    public boolean isToeplitzMatrix(int[][] matrix) {
3        int row=matrix.length,col=matrix[0].length;
4        for(int i=0;i<row-1;i++){
5            for(int j=0;j<col-1;j++){
6                if(matrix[i][j]!=matrix[i+1][j+1]){
7                    return false;
8                }
9            }
10        }
11        return true;
12    }
13}