// Last updated: 7/13/2026, 8:49:55 PM
class Solution {
    public int closedIsland(int[][] grid) {
        int c=0,row=grid.length,col=grid[0].length;
        for(int i=0;i<grid[0].length;i++){
            if(grid[0][i]==0) travel(grid,0,i);
            if(grid[row-1][i]==0) travel(grid,row-1,i);
        }
        for(int i=0;i<row;i++){
            if(grid[i][0]==0) travel(grid,i,0);
            if(grid[i][col-1]==0) travel(grid,i,col-1);
        }
        
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    c++;
                    travel(grid,i,j);
                }
            }
        }
        return c;
    }
    void travel(int[][] grid,int row,int col){
        if(col>=grid[0].length || col<0 || row<0 || row>=grid.length || grid[row][col]==1) return ;
        grid[row][col]=1;
        travel(grid,row,col+1);
        travel(grid,row,col-1);
        travel(grid,row-1,col);
        travel(grid,row+1,col);
    }
}
