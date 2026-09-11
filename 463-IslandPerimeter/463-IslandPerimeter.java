// Last updated: 9/11/2026, 6:44:46 AM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int peri=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]==1){
7                    if(i==0 || grid[i-1][j]==0){
8                        peri++;
9                    }
10                    if(i==grid.length-1 || grid[i+1][j]==0){
11                        peri++;
12                    }
13                    if(j==0 || grid[i][j-1]==0){
14                        peri++;
15                    }
16                    if(j==grid[i].length-1 || grid[i][j+1]==0){
17                        peri++;
18                    }
19                }
20            }
21        }
22        return peri;
23    }
24}