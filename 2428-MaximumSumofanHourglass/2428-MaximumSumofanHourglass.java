// Last updated: 9/17/2026, 7:19:52 AM
1class Solution {
2    public int maxSum(int[][] grid) {
3        int m=grid.length,n=grid[0].length;
4        int max=0;
5        for(int i=0;i<m-2;i++){
6            for(int j=0;j<n-2;j++){
7                int sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
8                if(sum>max){
9                    max=sum;
10                }
11            }
12        }
13        return max;
14    }
15}