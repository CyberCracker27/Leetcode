// Last updated: 7/14/2026, 6:52:53 AM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        StringBuilder s=new StringBuilder();
4        int a=Math.min(word1.length(),word2.length());
5        int i=0,j=0;
6        while(i<a&&j<a){
7            s.append(word1.charAt(i++));
8            s.append(word2.charAt(j++));
9        }
10        while(i<word1.length()){
11            s.append(word1.charAt(i++));
12        }
13        while(j<word2.length()){
14            s.append(word2.charAt(j++));
15        }
16        return s.toString();
17    }
18}