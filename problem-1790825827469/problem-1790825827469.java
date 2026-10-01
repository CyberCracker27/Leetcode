// Last updated: 10/1/2026, 9:07:07 AM
1class Solution {
2    public boolean strongPasswordCheckerII(String s) {
3        boolean l=false,u=false,d=false,st=false,ad=true;
4        for(int i=0;i<s.length()-1;i++){
5            if(Character.isLowerCase(s.charAt(i))){
6                l=true;
7            }
8            else if(Character.isUpperCase(s.charAt(i))){
9                u=true;
10            }
11            else if(Character.isDigit(s.charAt(i))){
12                d=true;
13            }else{
14                st=true;
15            }
16            if(s.charAt(i)==s.charAt(i+1)){
17                ad=false;
18            }
19        }
20        int i=s.length()-1;
21        if(Character.isLowerCase(s.charAt(i))){
22            l=true;
23        }
24        else if(Character.isUpperCase(s.charAt(i))){
25            u=true;
26        }
27        else if(Character.isDigit(s.charAt(i))){
28            d=true;
29        }else{
30            st=true;
31        }
32        if(l&&u&&d&&st&&ad&&s.length()>=8){
33            return true;
34        }else{
35            return false;
36        }
37    }
38}