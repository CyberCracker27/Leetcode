// Last updated: 6/15/2026, 12:11:57 PM
1class Solution {
2    public int closedIsland(int[][] grid) {
3        int c=0,row=grid.length,col=grid[0].length;
4        for(int i=0;i<grid[0].length;i++){
5            if(grid[0][i]==0) travel(grid,0,i);
6            if(grid[row-1][i]==0) travel(grid,row-1,i);
7        }
8        for(int i=0;i<row;i++){
9            if(grid[i][0]==0) travel(grid,i,0);
10            if(grid[i][col-1]==0) travel(grid,i,col-1);
11        }
12        
13        
14        for(int i=0;i<row;i++){
15            for(int j=0;j<col;j++){
16                if(grid[i][j]==0){
17                    c++;
18                    travel(grid,i,j);
19                }
20            }
21        }
22        return c;
23    }
24    void travel(int[][] grid,int row,int col){
25        if(col>=grid[0].length || col<0 || row<0 || row>=grid.length || grid[row][col]==1) return ;
26        grid[row][col]=1;
27        travel(grid,row,col+1);
28        travel(grid,row,col-1);
29        travel(grid,row-1,col);
30        travel(grid,row+1,col);
31    }
32}
33