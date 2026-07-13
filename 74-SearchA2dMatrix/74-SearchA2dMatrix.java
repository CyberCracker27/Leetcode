// Last updated: 7/13/2026, 8:54:47 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0,right=matrix.length*matrix[0].length-1;
        System.out.println(right);
        while(left<=right){
            int mid=left+(right-left)/2;
            int i=mid/matrix[0].length;
            int j=mid%matrix[0].length;
            System.out.println(i+" "+j);
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}