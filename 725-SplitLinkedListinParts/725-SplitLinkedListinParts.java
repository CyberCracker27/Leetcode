// Last updated: 7/4/2026, 5:40:26 PM
1class Solution {
2    public String convertDateToBinary(String date) {
3        String s="";
4        String o="";
5        for(int i=0;i<date.length();i++){
6            if(date.charAt(i)!='-'){
7                o+=date.charAt(i);
8            }
9            if(date.charAt(i)=='-' || i==date.length()-1){
10                s+=Integer.toBinaryString(Integer.parseInt(o));
11                if(i!=date.length()-1){
12                    s+="-";
13                }
14                o="";
15            }
16        }
17        return s;
18    }
19}