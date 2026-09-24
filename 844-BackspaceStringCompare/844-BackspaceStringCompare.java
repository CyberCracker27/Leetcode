// Last updated: 9/24/2026, 7:00:23 AM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        StringBuilder a=new StringBuilder();
4        StringBuilder b=new StringBuilder();
5
6        for(int i=0;i<s.length();i++){
7            char c=s.charAt(i);
8            if(c=='#'){
9                if(a.length()>0){
10                    a.deleteCharAt(a.length()-1);
11                }
12            }
13            else{
14                a.append(c);
15            }
16        }
17        for(int i=0;i<t.length();i++){
18            char c=t.charAt(i);
19            if(c=='#'){
20                if(b.length()>0){
21                    b.deleteCharAt(b.length()-1);
22                }
23            }
24            else{
25                b.append(c);
26            }
27        }
28
29        return a.toString().equals(b.toString());
30    }
31}