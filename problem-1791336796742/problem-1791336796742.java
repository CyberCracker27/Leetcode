// Last updated: 10/7/2026, 7:03:16 AM
1class Solution {
2    public int minimumChairs(String s) {
3        int current=0;
4        int f=0;
5        for(char c:s.toCharArray()){
6            if(c=='E'){
7                current++;
8            }else{
9                current--;
10            }
11            f=Math.max(f,current);
12        }
13        return f;
14    }
15}