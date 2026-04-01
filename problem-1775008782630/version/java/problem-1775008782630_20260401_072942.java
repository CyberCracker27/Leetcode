// Last updated: 01/04/2026, 07:29:42
1class Solution {
2    public int maxScore(String s) {
3        int c=0;
4        int d=0;
5        int sum=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='1'){
8                d++;
9            }
10            
11        }
12        for(int j=0;j<s.length()-1;j++){
13            if(s.charAt(j)=='0'){
14                c++;
15            }else{
16                d--;
17            }
18            if(c+d>sum){
19                sum=c+d;
20            }
21        }
22        return sum;
23    }
24}