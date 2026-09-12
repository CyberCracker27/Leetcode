// Last updated: 9/12/2026, 7:23:47 AM
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[][]=new int[grid.length][2];
        int col[][]=new int[grid[0].length][2];
        int diff[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            int rz=0,ro=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    rz++;
                }else{
                    ro++;
                }
            }
            row[i][0]=rz;
            row[i][1]=ro;
        }
        for(int i=0;i<grid[0].length;i++){
            int cz=0,co=0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==0){
                    cz++;
                }else{
                    co++;
                }
            }
            col[i][0]=cz;
            col[i][1]=co;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                diff[i][j]=row[i][1]+col[j][1]-row[i][0]-col[j][0];
            }
        }
        return diff;
    }
}