// Last updated: 10/5/2026, 6:33:42 AM
1class Solution {
2    public boolean checkString(String s) {
3        boolean b=false;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='b'){
6                b=true;
7            }
8            if(s.charAt(i)=='a' && b){
9                return false;
10            }
11        }
12        return true;
13    }
14}