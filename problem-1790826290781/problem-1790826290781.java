// Last updated: 10/1/2026, 9:14:50 AM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int i=0,j=s.length()-1;
4        while(i<=j){
5            if(s.charAt(i)==s.charAt(j)){
6                return i;
7            }
8            i++;
9            j--;
10        }
11        return -1;
12    }
13}