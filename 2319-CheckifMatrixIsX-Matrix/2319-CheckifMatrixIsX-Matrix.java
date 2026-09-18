// Last updated: 9/18/2026, 6:43:57 AM
1class Solution {
2    public boolean checkXMatrix(int[][] grid) {
3        int m=grid.length-1,n=grid[0].length-1;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(i==j || j==n){
7                    if(j==n) n--;
8                    if(grid[i][j]==0){
9                        return false;
10                    }
11                }else{
12                    if(grid[i][j]!=0){
13                        return false;
14                    }
15                }
16            }
17        }
18        return true;
19    }
20}