// Last updated: 9/24/2026, 6:42:21 AM
1class Solution {
2    public String removeStars(String s) {
3        StringBuilder st=new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='*'){
6                st.deleteCharAt(st.length()-1);
7            }else{
8                st.append(s.charAt(i));
9            }
10        }
11        return st.toString();
12    }
13}