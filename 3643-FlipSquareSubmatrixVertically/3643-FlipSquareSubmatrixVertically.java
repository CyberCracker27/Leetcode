// Last updated: 9/10/2026, 6:57:10 AM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        int i=x,j=x+k-1;
4        while(i<j){
5            for(int m=y;m<y+k;m++){
6                int temp=grid[i][m];
7                grid[i][m]=grid[j][m];
8                grid[j][m]=temp;
9            }
10            i++;
11            j--;
12        }
13        return grid;
14    }
15}