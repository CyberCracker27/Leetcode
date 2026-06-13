// Last updated: 6/13/2026, 3:22:36 PM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int c=0,row=grid.length,col=grid[0].length;
4
5        for(int i=0;i<row;i++){
6            for(int j=0;j<col;j++){
7                if(grid[i][j]==1){
8                    c=Math.max(c,travel(grid,i,j));
9
10                }
11            }
12        }
13        return c;
14    }
15    int travel(int[][] grid,int row,int col){
16        if(col>=grid[0].length || col<0 || row<0 || row>=grid.length || grid[row][col]==0) return 0;
17        grid[row][col]=0;
18        return 1+travel(grid,row,col+1)+travel(grid,row,col-1)+travel(grid,row-1,col)+travel(grid,row+1,col);
19    }
20}