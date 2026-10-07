// Last updated: 10/7/2026, 6:47:05 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder st=new StringBuilder();
4        for(char c:s.toCharArray()){
5            if(c!='-'){
6                if(Character.isLowerCase(c)){
7                    c=Character.toUpperCase(c);
8                }
9                st.append(c);
10            }
11        }
12        st.reverse();
13        int f=0;
14        for(int i=0;i<st.length();i++){
15            if(f==k){
16                st.insert(i,"-");
17                i++;
18                f=0;
19            }
20            f++;
21        }
22        return st.reverse().toString();
23    }
24}