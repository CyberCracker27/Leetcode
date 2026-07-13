// Last updated: 7/13/2026, 8:50:47 PM
class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color){
        int m=grid.length,n=grid[0].length;
        int c=grid[row][col];
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return dfs(grid,row,col,c,visited,color);
        
    }
    public int[][] dfs(int[][] grid,int i,int j,int c,boolean[][] visited,int color){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=c || visited[i][j]) return grid;
        visited[i][j]=true;
        boolean border = false;
        if(i == 0 || j == 0 || j == grid[0].length - 1 || i == grid.length - 1 || grid[i+1][j] != c || grid[i-1][j] != c || grid[i][j-1] !=c || grid[i][j+1] != c)
            border = true;
        grid=dfs(grid,i,j+1,c,visited,color);
        grid=dfs(grid,i,j-1,c,visited,color);
        grid=dfs(grid,i-1,j,c,visited,color);
        grid=dfs(grid,i+1,j,c,visited,color);
        if(border)
        grid[i][j]=color;
        return grid;
    }
}