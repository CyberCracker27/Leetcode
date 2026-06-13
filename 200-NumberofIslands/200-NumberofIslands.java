// Last updated: 6/13/2026, 2:58:43 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int c=0,row=grid.length,col=grid[0].length;
4        for(int i=0;i<row;i++){
5            for(int j=0;j<col;j++){
6                if(grid[i][j]=='1'){
7                    c++;
8                    travel(grid,i,j);
9                }
10            }
11        }
12        return c;
13    }
14    void travel(char[][] grid,int row,int col){
15        if(col>=grid[0].length || col<0 || row<0 || row>=grid.length || grid[row][col]=='0') return ;
16        grid[row][col]='0';
17        travel(grid,row,col+1);
18        travel(grid,row,col-1);
19        travel(grid,row-1,col);
20        travel(grid,row+1,col);
21    }
22}