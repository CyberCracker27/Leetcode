// Last updated: 9/28/2026, 6:57:42 AM
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max=0;
4        for(String s:sentences){
5            String arr[]=s.split(" ");
6            if(arr.length>max){
7                max=arr.length;
8            }
9        }
10        return max;
11    }
12}