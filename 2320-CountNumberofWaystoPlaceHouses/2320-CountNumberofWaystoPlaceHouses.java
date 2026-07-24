// Last updated: 7/24/2026, 9:19:09 AM
1class Solution {
2    public int getSum(int a, int b) {
3        if(a==0) return b;
4        if(b==0) return a;
5        while(b!=0){
6            int carry=a&b;
7            a=a^b;
8            b=carry<<1;
9        }
10        return a;
11    }
12}