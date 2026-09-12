// Last updated: 9/12/2026, 7:25:30 AM
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            Set<Integer> s=new HashSet<>();
            for(int j=0;j<n;j++){
                if(!s.add(matrix[i][j])){
                    return false;
                }
            }
        }
        for(int i=0;i<n;i++){
            Set<Integer> s=new HashSet<>();
            for(int j=0;j<n;j++){
                if(!s.add(matrix[j][i])){
                    return false;
                }
            }
        }
        return true;
    }
}