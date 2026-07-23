// Last updated: 7/23/2026, 6:45:01 AM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int max=-1;
4        for(int i=0;i<s.length();i++){
5            int c=0;
6            for(int j=i+1;j<s.length();j++){
7                if(s.charAt(i)==s.charAt(j)){
8                    max=Math.max(max,c);
9                }
10                c++;
11            }
12        }
13        return max;
14    }
15}