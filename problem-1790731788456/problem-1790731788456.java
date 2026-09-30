// Last updated: 9/30/2026, 6:59:48 AM
1class Solution {
2    public String finalString(String s) {
3        StringBuilder st=new StringBuilder();
4        for(char c:s.toCharArray()){
5            if(c=='i'){
6                st.reverse();
7            }else{
8                st.append(c);
9            }
10        }
11        return st.toString();
12    }
13}