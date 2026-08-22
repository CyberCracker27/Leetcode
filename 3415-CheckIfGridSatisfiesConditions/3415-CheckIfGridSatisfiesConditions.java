// Last updated: 8/22/2026, 6:55:46 AM
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]!=grid[i+1][j]){
                    return false;
                }
            }
            for(int j=0;j<grid[i].length-1;j++){
                if(grid[i][j]==grid[i][j+1]){
                    return false;
                }
            }
        }
        for(int j=0;j<grid[grid.length-1].length-1;j++){
            if(grid[grid.length-1][j]==grid[grid.length-1][j+1]){
                return false;
            }
        }
        return true;

    }
}