// Last updated: 9/15/2026, 7:07:19 AM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m=grid.length,n=grid[0].length;
4        for(int i=0;i<k;i++){
5            for(int j=0;j<m;j++){
6                int temp[]=new int[n];
7                for(int l=0;l<n;l++){
8                    temp[l]=grid[j][(l+(n-1))%n];
9                }
10                grid[j]=temp;
11            }
12            int temp[]=new int[m];
13            for(int j=0;j<m;j++){
14                temp[j]=grid[(j+(m-1))%m][0];
15            }
16            for(int j=0;j<m;j++){
17                grid[j][0]=temp[j];
18            }
19        }
20        List<List<Integer>> li1=new ArrayList<>();
21        for(int i=0;i<m;i++){
22            List<Integer> li=new ArrayList<>();
23            for(int j=0;j<n;j++){
24                li.add(grid[i][j]);
25            }
26            li1.add(li);
27        }
28        return li1;
29    }
30}