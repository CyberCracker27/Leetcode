// Last updated: 6/19/2026, 7:25:06 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int a=0;
4        int b=0;
5        for(int x:gain){
6            b+=x;
7            if(b>a){
8                a=b;
9            }
10        }
11        return a;
12    }
13}