// Last updated: 15/03/2026, 09:00:56
1class Solution {
2    public int countCommas(int n) {
3        if(n<1000){
4            return 0;
5        }else{
6            return n-1000+1;
7        }
8    }
9}