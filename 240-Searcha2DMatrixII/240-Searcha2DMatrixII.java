// Last updated: 6/3/2026, 8:39:32 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row=0,col=matrix[0].length-1;
4        while(row<matrix.length&& col>=0){
5            if(matrix[row][col]==target){
6                return true;
7            }else if(matrix[row][col]<target){
8                row++;
9            }else{
10                col--;
11            }
12            
13        }
14        return false;
15    }
16}