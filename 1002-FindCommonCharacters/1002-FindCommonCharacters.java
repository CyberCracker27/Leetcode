// Last updated: 8/19/2026, 6:52:34 AM
1class Solution {
2    public int earliestTime(int[][] tasks) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<tasks.length;i++){
5            int sum=tasks[i][0]+tasks[i][1];
6            if(sum<min){
7                min=sum;
8            }
9        }
10        return min;
11    }
12}