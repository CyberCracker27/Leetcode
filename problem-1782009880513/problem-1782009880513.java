// Last updated: 6/21/2026, 8:14:40 AM
1class Solution {
2    public int maxDistance(String moves) {
3        int a=0,b=0,c=0,d=0,e=0;
4        for(char i:moves.toCharArray()){
5            if(i=='U'){
6                a++;
7            }else if(i=='D'){
8                b++;
9            }else if(i=='L'){
10                c++;
11            }else if(i=='R'){
12                d++;
13            }else{
14                e++;
15            }
16        }
17        int x=d-c;
18        int y=a-b;
19        return Math.abs(x)+Math.abs(y)+e;
20    }
21}