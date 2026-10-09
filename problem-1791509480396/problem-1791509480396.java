// Last updated: 10/9/2026, 7:01:20 AM
1class Solution {
2    public String clearDigits(String s) {
3        StringBuilder st=new StringBuilder();
4        for(char c:s.toCharArray()){
5            if(Character.isDigit(c)){
6                st.deleteCharAt(st.length() - 1);
7            }else{
8                st.append(c);
9            }
10
11        }
12        return st.toString();
13    }
14}