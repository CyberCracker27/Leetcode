// Last updated: 6/16/2026, 8:24:44 PM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder sl=new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='*'){
6                if(sl.length()>0){
7                    sl.deleteCharAt(sl.length() - 1);
8                }
9            }else if(s.charAt(i)=='#'){
10                sl.append(sl);
11            }else if(s.charAt(i)=='%'){
12                sl.reverse();
13            }else{
14                sl.append(s.charAt(i));
15            }
16        }
17        return sl.toString();
18    }
19}