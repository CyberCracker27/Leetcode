// Last updated: 9/17/2026, 7:01:19 AM
1class Solution {
2    public int[][] matrixBlockSum(int[][] mat, int k) {
3        int m=mat.length,n=mat[0].length;
4        int arr[][]=new int[m][n];
5        for(int i=0;i<m;i++){
6            for(int j=0;j<n;j++){
7                int sum=0;
8                int l=i-k;
9                if(l<0){
10                    l=0;
11                }
12                while(l<=i+k && l<m){
13                    int h=j-k;
14                    if(h<0){
15                        h=0;
16                    }
17                    while(h<=j+k && h<n){
18                        sum+=mat[l][h];
19                        h++;
20                    }
21                    l++;
22                }
23                arr[i][j]=sum;
24            }
25        }
26        return arr;
27    }
28}