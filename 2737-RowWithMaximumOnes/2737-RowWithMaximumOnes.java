// Last updated: 8/18/2026, 6:49:57 AM
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[]=new int[2];
        int max=0;
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c>max){
                max=c;
                arr[0]=i;
                arr[1]=c;
            }
        }
        return arr;
    }
}