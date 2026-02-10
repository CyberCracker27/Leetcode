// Last updated: 10/02/2026, 08:07:24
1class Solution {
2    public int xorOperation(int n, int start) {
3        int a=start;
4        for(int i=1;i<n;i++){
5            int b=start+2*i;
6            a=a^b;
7        }
8        return a;
9    }
10}