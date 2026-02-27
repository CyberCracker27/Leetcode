// Last updated: 27/02/2026, 07:34:05
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] a=new int[gain.length+1];
4        a[0]=0;
5        int max=0;
6        for(int i=0;i<gain.length;i++){
7            a[i+1]=a[i]+gain[i];
8            if(a[i+1]>max){
9                max=a[i+1];
10            }
11        }
12        return max;
13    }
14}