// Last updated: 8/13/2026, 7:08:01 AM
1class Solution {
2    public int possibleStringCount(String word) {
3        int n=word.length();
4        int count=n;
5        for(int i=1;i<n;i++){
6            if(word.charAt(i)!=word.charAt(i-1)){
7                count--;
8            }
9        }
10        return count;
11    }
12}