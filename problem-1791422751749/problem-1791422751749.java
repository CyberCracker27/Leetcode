// Last updated: 10/8/2026, 6:55:51 AM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String st[]=s.split("\\s+");
4        StringBuilder sr=new StringBuilder();
5        for(int i=0;i<k;i++){
6            sr.append(st[i]);
7            if(i<k-1){
8                sr.append(" ");
9            }
10        }
11        return sr.toString();
12    }
13}