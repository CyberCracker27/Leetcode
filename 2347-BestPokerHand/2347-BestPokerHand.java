// Last updated: 7/15/2026, 6:59:02 AM
1class Solution {
2    public int divisorSubstrings(int num, int k) {
3        String s=String.valueOf(num);
4        int c=0;
5        for(int i=0;i<=s.length()-k;i++){
6            int a=Integer.parseInt(s.substring(i,i+k));
7            if(a==0) continue;
8            if(num%a==0){
9                c++;
10            }
11        }
12        return c;
13    }
14}