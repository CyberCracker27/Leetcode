// Last updated: 31/01/2026, 07:54:13
1class Solution {
2    public long removeZeros(long n) {
3        String s="";
4        while(n!=0){
5            long a=n%10;
6            if(a!=0){
7                s=String.valueOf(a)+s;
8            }
9            n/=10;
10        }
11        return Long.parseLong(s);
12    }
13}