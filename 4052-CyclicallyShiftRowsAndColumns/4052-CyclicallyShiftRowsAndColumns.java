// Last updated: 9/16/2026, 7:03:59 AM
class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<n;i++){
            int c=rowShift[i]%n;
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                temp[j]=grid[i][(j+c)%n];
            }
            grid[i]=temp;
        }
        for(int i=0;i<n;i++){
            int c=colShift[i]%n;
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                temp[j]=grid[(j+c)%n][i];
            }
            for(int j=0;j<n;j++){
                grid[j][i]=temp[j];
            }
        }
        return grid;
    }
}