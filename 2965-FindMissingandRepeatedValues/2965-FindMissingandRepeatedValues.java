// Last updated: 9/19/2026, 7:02:15 AM
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int arr[]=new int[2];
4        Set<Integer> s=new HashSet<>();
5        int c=grid[0].length*grid[0].length;
6        for(int i=0;i<grid.length;i++){
7            for(int j=0;j<grid[0].length;j++){
8                if(!s.add(grid[i][j])){
9                    arr[0]=grid[i][j];
10                }
11            }
12        }
13        for(int i=1;i<=c;i++){
14            if(!s.contains(i)){
15                arr[1]=i;
16            }
17        }
18        return arr;
19    }
20}