// Last updated: 16/02/2026, 07:48:54
1class Solution {
2    public int[] sumZero(int n) {
3        int[] res =new int[n];
4        res[0]=n*(1-n)/2;
5        for(int i=1;i<n;i++){
6            res[i]=i;
7        }
8        return res;
9    }
10}