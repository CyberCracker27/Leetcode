// Last updated: 10/12/2026, 6:47:28 AM
1class Solution {
2    public String getEncryptedString(String s, int k) {
3        int n=s.length();
4        k=k%n;
5        StringBuilder st=new StringBuilder();
6        for(int i=0;i<n;i++){
7            st.append(s.charAt((i+k)%n));
8        }
9        return st.toString();
10    }
11}