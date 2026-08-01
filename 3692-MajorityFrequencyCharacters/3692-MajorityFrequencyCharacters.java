// Last updated: 8/1/2026, 8:27:58 AM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max=0;
4        for(int i=0;i<accounts.length;i++){
5            int c=0;
6            for(int j=0;j<accounts[i].length;j++){
7                c+=accounts[i][j];
8            }
9            if(c>max){
10                max=c;
11            }
12        }
13        return max;
14    }
15}