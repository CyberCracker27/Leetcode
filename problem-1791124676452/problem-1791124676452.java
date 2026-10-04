// Last updated: 10/4/2026, 8:07:56 PM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int a=s.length()/2;
4        String v="aeiouAEIOU";
5        int c1=0,c2=0;
6        for(int i=0;i<a;i++){
7            if(v.contains(String.valueOf(s.charAt(i)))){
8                c1++;
9            }
10        }
11        for(int i=a;i<s.length();i++){
12            if(v.contains(String.valueOf(s.charAt(i)))){
13                c2++;
14            }
15        }
16        return c1==c2;
17    }
18}