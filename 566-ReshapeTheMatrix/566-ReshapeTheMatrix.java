// Last updated: 9/12/2026, 7:40:27 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][]=new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        if(r*c!=row*col){
            return mat;
        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[count/c][count%c]=mat[i][j];
                count++;
            }
        }
        return arr;
    }
}