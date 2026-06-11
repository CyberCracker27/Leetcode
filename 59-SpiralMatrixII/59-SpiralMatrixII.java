// Last updated: 6/11/2026, 3:31:04 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] arr=new int[n][n];
4        int k=1;
5        int top=0,bottom=n-1,left=0,right=n-1;
6        while(k<=n*n){
7            for(int i=left;i<=right;i++){
8                arr[top][i]=k++;
9                
10            }
11            top++;
12            for(int i=top;i<=bottom;i++){
13
14                arr[i][right]=k++;
15            }
16            right--;
17            for(int i=right;i>=left;i--){
18                arr[bottom][i]=k++;
19            }
20            bottom--;
21            for(int i=bottom;i>=top;i--){
22                arr[i][left]=k++;
23            }
24            left++;
25        }
26        return arr;
27    }
28}