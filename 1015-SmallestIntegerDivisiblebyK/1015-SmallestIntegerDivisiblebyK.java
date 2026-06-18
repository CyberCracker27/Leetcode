// Last updated: 6/18/2026, 6:49:56 AM
1class Solution {
2    public int smallestRepunitDivByK(int k) {
3        int rem=0;
4        for(int i=1;i<=k;i++){
5            rem=(rem*10+1)%k;
6            if(rem==0) return i;
7        }
8        return -1;
9    }
10}