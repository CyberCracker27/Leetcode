// Last updated: 7/15/2026, 7:05:01 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int arr[]=new int[matrix.length];
4        for(int i=0;i<matrix.length;i++){
5            int c=0;
6            for(int j=0;j<matrix[i].length;j++){
7                c+=matrix[i][j];
8            }
9            arr[i]=c;
10        }
11        return arr;
12    }
13}