// Last updated: 7/30/2026, 6:43:04 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int n=word.length();
4        int c=0;
5        for(int i=0;i<n;i++){
6            c+=i/8+1;
7        }
8        return c;
9    }
10}