// Last updated: 7/7/2026, 6:58:40 AM
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        if(n==0){
4            return 1;
5        }
6        int total=10;
7        int prod=9;
8        for(int i=2;i<=n;i++){
9            total+=prod*(11-i);
10            prod*=11-i;
11        }
12        return total;
13    }
14}