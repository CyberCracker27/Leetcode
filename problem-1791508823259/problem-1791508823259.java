// Last updated: 10/9/2026, 6:50:23 AM
1class Solution {
2    public boolean hasSameDigits(String s) {
3        while(s.length()>2){
4            StringBuilder st=new StringBuilder();
5            for(int i=0;i<s.length()-1;i++){
6                st.append(((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10);
7            }
8            s=st.toString();
9        }
10        if(s.charAt(0)==s.charAt(1)){
11            return true;
12        }else{
13            return false;
14        }
15    }
16}