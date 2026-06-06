// Last updated: 6/6/2026, 4:07:31 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int arr[][]=new int[grid.length][grid[0].length];
4        int prev=0;
5        for(int i=0;i<grid.length;i++){
6            arr[i][0]=grid[i][0]+prev;
7            prev=arr[i][0];
8        }
9        prev=0;
10        for(int i=0;i<grid[0].length;i++){
11            arr[0][i]=grid[0][i]+prev;
12            prev=arr[0][i];
13        }
14        for(int i=1;i<grid.length;i++){
15            for(int j=1;j<grid[0].length;j++){
16                arr[i][j]=grid[i][j]+Math.min(arr[i][j-1],arr[i-1][j]);
17            }
18        }
19        return arr[grid.length-1][grid[0].length-1];
20    }
21}