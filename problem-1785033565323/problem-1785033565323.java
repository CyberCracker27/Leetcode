// Last updated: 7/26/2026, 8:09:25 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s==0) return 0;
4        if(s>n*9) return -1;
5        int ans=0;
6        for(int i=0;i<n;i++){
7            int digit=Math.min(9,s);
8            ans=ans*10+digit;
9            s-=digit;
10        }
11        return ans;
12    }
13}