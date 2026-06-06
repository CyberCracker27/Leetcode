// Last updated: 6/6/2026, 12:27:37 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] arr=new int[m][n];
4        for(int i=0;i<m;i++){
5            arr[i][0]=1;
6        }
7        for(int i=0;i<n;i++){
8            arr[0][i]=1;
9        }
10        for(int i=1;i<m;i++){
11            for(int j=1;j<n;j++){
12                arr[i][j]=arr[i-1][j]+arr[i][j-1];
13            }
14        }
15        return arr[m-1][n-1];
16    }
17}