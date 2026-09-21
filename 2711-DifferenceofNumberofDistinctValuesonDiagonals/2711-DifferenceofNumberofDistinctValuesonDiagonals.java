// Last updated: 9/21/2026, 6:49:22 AM
1class Solution {
2    public int[][] differenceOfDistinctValues(int[][] grid) {
3        int m=grid.length,n=grid[0].length;
4        int arr[][]=new int[m][n];
5        for(int i=0;i<m;i++){
6            for(int j=0;j<n;j++){
7                Set<Integer> leftabove=new HashSet<>();
8                Set<Integer> rightbelow=new HashSet<>();
9                int l=i-1,k=j-1;
10                while(l>=0 && k>=0){
11                    leftabove.add(grid[l][k]);
12                    l--;
13                    k--;
14                }
15                l=i+1;
16                k=j+1;
17                while(l<m && k<n){
18                    rightbelow.add(grid[l][k]);
19                    l++;
20                    k++;
21                }
22                arr[i][j]=Math.abs(leftabove.size()-rightbelow.size());
23            }
24        }
25        return arr;
26    }
27}