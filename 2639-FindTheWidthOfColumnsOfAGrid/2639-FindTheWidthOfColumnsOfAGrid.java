// Last updated: 9/12/2026, 7:23:15 AM
class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] a=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            int max=0;
            for(int j=0;j<grid.length;j++){
                int c=String.valueOf(grid[j][i]).length();
                if(c>max){
                    max=c;
                }
            }
            a[i]=max;
        }
        return a;
    }
}