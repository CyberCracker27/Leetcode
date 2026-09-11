// Last updated: 9/11/2026, 7:12:53 AM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int arr[][]=new int[r][c];
4        int row=mat.length;
5        int col=mat[0].length;
6        if(r*c!=row*col){
7            return mat;
8        }
9        int count=0;
10        for(int i=0;i<row;i++){
11            for(int j=0;j<col;j++){
12                arr[count/c][count%c]=mat[i][j];
13                count++;
14            }
15        }
16        return arr;
17    }
18}