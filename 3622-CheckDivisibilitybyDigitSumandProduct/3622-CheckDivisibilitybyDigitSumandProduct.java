// Last updated: 8/22/2026, 6:58:10 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum=0;
4        int product=1;
5        int temp=n;
6        while(temp!=0){
7            int digit=temp%10;
8            sum+=digit;
9            product*=digit;
10            temp/=10;
11        }
12        return n%(sum+product)==0;
13    }
14}