// Last updated: 04/03/2026, 07:44:53
1class Solution {
2    public int minimumMoves(String s) {
3        int i=0;
4        int min=0;
5        while(i<s.length()){
6            char ch=s.charAt(i);
7            if(ch=='X'){
8                min++;
9                i+=3;
10            }else{
11                i++;
12            }
13        }
14        return min;
15    }
16}