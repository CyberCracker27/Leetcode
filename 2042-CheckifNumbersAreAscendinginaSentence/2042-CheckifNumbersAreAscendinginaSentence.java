// Last updated: 10/5/2026, 6:42:21 AM
1class Solution {
2    public boolean areNumbersAscending(String s) {
3        int prev=-1;
4        for(String x:s.split(" ")){
5            if(Character.isDigit(x.charAt(0))){
6                int cur=Integer.parseInt(x);
7                if(prev>=cur){
8                    return false; 
9                }
10                prev=cur;
11            }
12        }
13        return true;
14    }
15}