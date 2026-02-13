// Last updated: 13/02/2026, 07:39:53
1class Solution {
2    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
3        int c=0;
4        for(int i=0;i<startTime.length;i++){
5            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
6                c++;
7            }
8        }
9        return c;
10    }
11}