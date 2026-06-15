// Last updated: 6/15/2026, 10:31:48 AM
1class Solution {
2    public int[][] colorBorder(int[][] grid, int row, int col, int color){
3        int m=grid.length,n=grid[0].length;
4        int c=grid[row][col];
5        boolean[][] visited = new boolean[grid.length][grid[0].length];
6        return dfs(grid,row,col,c,visited,color);
7        
8    }
9    public int[][] dfs(int[][] grid,int i,int j,int c,boolean[][] visited,int color){
10        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=c || visited[i][j]) return grid;
11        visited[i][j]=true;
12        boolean border = false;
13        if(i == 0 || j == 0 || j == grid[0].length - 1 || i == grid.length - 1 || grid[i+1][j] != c || grid[i-1][j] != c || grid[i][j-1] !=c || grid[i][j+1] != c)
14            border = true;
15        grid=dfs(grid,i,j+1,c,visited,color);
16        grid=dfs(grid,i,j-1,c,visited,color);
17        grid=dfs(grid,i-1,j,c,visited,color);
18        grid=dfs(grid,i+1,j,c,visited,color);
19        if(border)
20        grid[i][j]=color;
21        return grid;
22    }
23}