// Last updated: 7/25/2026, 6:55:21 AM
1class Solution {
2    public int countVowelStrings(int n) {
3        int a=1,e=1,i=1,o=1,u=1;
4        while(n-->1){
5            o+=u;
6            i+=o;
7            e+=i;
8            a+=e;
9        }
10        return a+e+i+o+u;
11    }
12}