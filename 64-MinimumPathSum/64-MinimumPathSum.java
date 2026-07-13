// Last updated: 7/13/2026, 8:54:53 PM
class Solution {
    public int minPathSum(int[][] grid) {
        int arr[][]=new int[grid.length][grid[0].length];
        int prev=0;
        for(int i=0;i<grid.length;i++){
            arr[i][0]=grid[i][0]+prev;
            prev=arr[i][0];
        }
        prev=0;
        for(int i=0;i<grid[0].length;i++){
            arr[0][i]=grid[0][i]+prev;
            prev=arr[0][i];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                arr[i][j]=grid[i][j]+Math.min(arr[i][j-1],arr[i-1][j]);
            }
        }
        return arr[grid.length-1][grid[0].length-1];
    }
}