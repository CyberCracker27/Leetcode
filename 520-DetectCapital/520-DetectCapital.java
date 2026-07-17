// Last updated: 7/17/2026, 6:44:51 AM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int n=word.length();
4        int c=0;
5        for(char ch:word.toCharArray()){
6            if(ch>='A' && ch<='Z'){
7                c++;
8            }
9        }
10        if(c==n){
11            return true;
12        }
13        if(c==0){
14            return true;
15        }
16        if(c==1 && word.charAt(0)>='A' && word.charAt(0)<='Z'){
17            return true;
18        }
19        return false;
20    }
21}