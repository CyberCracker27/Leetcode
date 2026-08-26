// Last updated: 8/26/2026, 10:10:00 AM
1class Solution {
2    public int oddCells(int m, int n, int[][] indices) {
3        int arr[][]=new int[m][n];
4        for(int i=0;i<indices.length;i++){
5            int r=indices[i][0];
6            int c=indices[i][1];
7            for(int j=0;j<n;j++){
8                arr[r][j]++;
9            }
10            for(int j=0;j<m;j++){
11                arr[j][c]++;
12            }
13        }
14        int count=0;
15        for(int i=0;i<m;i++){
16            for(int j=0;j<n;j++){
17                if(arr[i][j]%2!=0){
18                    count++;
19                }
20            }
21        }
22        return count;
23    }
24}