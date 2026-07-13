// Last updated: 7/13/2026, 8:50:18 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m][n];
        for(int[] d:dp) Arrays.fill(d,-1);
        return rec(text1,text2,0,0,dp);
    }
    public int rec(String t1,String t2,int left,int right,int[][] dp){
        if(left>=t1.length() || right>=t2.length()){
            return 0;
        }
        if(dp[left][right]!=-1){
            return dp[left][right];
        }
        if(t1.charAt(left)==t2.charAt(right)){
            return dp[left][right]=1+rec(t1,t2,left+1,right+1,dp);
        }else{
            return dp[left][right]=Math.max(rec(t1,t2,left+1,right,dp),rec(t1,t2,left,right+1,dp));
        }
    }
}