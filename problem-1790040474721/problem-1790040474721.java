// Last updated: 9/22/2026, 6:57:54 AM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int m=matrix.length,n=matrix[0].length;
4        int arr[]=new int[m*n];
5        int c=0;
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                arr[c++]=matrix[i][j];
9            }
10        }
11        Arrays.sort(arr);
12        return arr[k-1];
13    }
14}