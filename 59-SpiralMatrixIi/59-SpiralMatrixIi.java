// Last updated: 7/13/2026, 8:54:59 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int k=1;
        int top=0,bottom=n-1,left=0,right=n-1;
        while(k<=n*n){
            for(int i=left;i<=right;i++){
                arr[top][i]=k++;
                
            }
            top++;
            for(int i=top;i<=bottom;i++){

                arr[i][right]=k++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=k++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=k++;
            }
            left++;
        }
        return arr;
    }
}