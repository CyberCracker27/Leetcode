// Last updated: 6/29/2026, 2:25:51 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        for(int i=0;i<matrix.length;i++){
4            for(int j=i;j<matrix[0].length;j++){
5                int temp=matrix[i][j];
6                matrix[i][j]=matrix[j][i];
7                matrix[j][i]=temp;
8            }
9        }
10        for(int i=0;i<matrix.length;i++){
11            int left=0,right=matrix[i].length-1;
12            while(left<right){
13                int temp=matrix[i][left];
14                matrix[i][left]=matrix[i][right];
15                matrix[i][right]=temp;
16                left++;
17                right--;
18            }
19        }
20    }
21}