// Last updated: 6/6/2026, 11:19:39 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m=text1.length();
4        int n=text2.length();
5        int[][] dp=new int[m][n];
6        for(int[] d:dp) Arrays.fill(d,-1);
7        return rec(text1,text2,0,0,dp);
8    }
9    public int rec(String t1,String t2,int left,int right,int[][] dp){
10        if(left>=t1.length() || right>=t2.length()){
11            return 0;
12        }
13        if(dp[left][right]!=-1){
14            return dp[left][right];
15        }
16        if(t1.charAt(left)==t2.charAt(right)){
17            return dp[left][right]=1+rec(t1,t2,left+1,right+1,dp);
18        }else{
19            return dp[left][right]=Math.max(rec(t1,t2,left+1,right,dp),rec(t1,t2,left,right+1,dp));
20        }
21    }
22}