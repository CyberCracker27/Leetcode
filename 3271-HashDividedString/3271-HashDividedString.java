// Last updated: 9/8/2026, 6:47:10 AM
1class Solution {
2    public String stringHash(String s, int k) {
3        StringBuilder st=new StringBuilder();
4        for(int i=0;i<=s.length()-k;i+=k){
5            int sum=0;
6            for(int j=i;j<i+k;j++){
7                sum+=s.charAt(j)-97;
8            }
9            sum%=26;
10            sum+=97;
11            st.append((char)sum);
12        }
13        return st.toString();
14    }
15}