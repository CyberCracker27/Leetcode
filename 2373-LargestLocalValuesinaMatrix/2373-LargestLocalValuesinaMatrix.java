// Last updated: 9/9/2026, 7:12:00 AM
1class Solution {
2    public int[][] largestLocal(int[][] grid) {
3        int n=grid.length;
4        int maxlo[][]=new int[n-2][n-2];
5        for(int i=0;i<n-2;i++){
6            for(int j=0;j<n-2;j++){
7                int max=0;
8                for(int k=i;k<i+3;k++){
9                    for(int l=j;l<j+3;l++){
10                        if(grid[k][l]>max){
11                            max=grid[k][l];
12                        }
13                    }
14                }
15                maxlo[i][j]=max;
16            }
17        }
18        return maxlo;
19    }
20}