// Last updated: 8/27/2026, 7:06:43 AM
1class Solution {
2    public int scoreOfString(String s) {
3        int count=0;
4        for(int i=1;i<s.length();i++){
5            count+=Math.abs(Integer.valueOf(s.charAt(i-1))-Integer.valueOf(s.charAt(i)));
6        }
7        return count;
8    }
9}