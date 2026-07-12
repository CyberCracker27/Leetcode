// Last updated: 7/12/2026, 8:15:05 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String arr1[]=startTime.split(":");
4        String arr2[]=endTime.split(":");
5        int sec1=0;
6        int sec2=0;
7        sec1+=Integer.parseInt(arr1[0])*3600+Integer.parseInt(arr1[1])*60+Integer.parseInt(arr1[2]);
8        sec2+=Integer.parseInt(arr2[0])*3600+Integer.parseInt(arr2[1])*60+Integer.parseInt(arr2[2]);
9        return sec2-sec1;
10    }
11}