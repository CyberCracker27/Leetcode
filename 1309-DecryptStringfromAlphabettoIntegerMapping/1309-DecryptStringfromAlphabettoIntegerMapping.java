// Last updated: 10/10/2026, 6:49:41 AM
1class Solution {
2    public String freqAlphabets(String s) {
3        StringBuilder st=new StringBuilder();
4        int i=s.length()-1;
5        while(i>=0){
6            if(s.charAt(i)=='#'){
7                String d=""+s.charAt(i-2)+s.charAt(i-1);
8                st.append((char)('a'+Integer.parseInt(d)-1));
9                i-=3;
10            }else{
11                st.append((char)(s.charAt(i)-'1'+'a'));
12                i--;
13            }
14        }
15        return st.reverse().toString();
16    }
17}