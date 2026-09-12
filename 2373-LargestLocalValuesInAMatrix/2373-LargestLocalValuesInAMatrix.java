// Last updated: 9/12/2026, 7:24:37 AM
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int maxlo[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max=0;
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(grid[k][l]>max){
                            max=grid[k][l];
                        }
                    }
                }
                maxlo[i][j]=max;
            }
        }
        return maxlo;
    }
}