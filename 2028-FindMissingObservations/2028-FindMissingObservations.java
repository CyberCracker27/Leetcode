// Last updated: 10/15/2026, 6:51:41 AM
1class Solution {
2    public int[] missingRolls(int[] rolls, int mean, int n) {
3        int m=rolls.length;
4        int totalsum=mean*(m+n);
5        int rollsum=0;
6        for(int x:rolls){
7            rollsum+=x;
8        }
9        int rem=totalsum-rollsum;
10        if(rem<n || rem>6*n){
11            return new int[0];
12        }
13        int base=rem/n;
14        int result[]=new int[n];
15        int remainder=rem%n;
16        for(int i=0;i<n;i++){
17            result[i]=base+(i<remainder?1:0);
18        }
19        return result;
20    }
21}