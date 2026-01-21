// Last updated: 21/01/2026, 22:09:03
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int a[][]=new int[m][n];
        // int b=original.length();
        if(original.length!=m*n){
            return new int[0][0];
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=original[c++];
            }
        }
        return a;
    }
}