// Last updated: 10/12/2026, 7:28:22 AM
1class Solution {
2    public int finalPositionOfSnake(int n, List<String> commands) {
3        int i=0,j=0;
4        for(String s:commands){
5            if(s.equals("UP")){
6                i--;
7            }
8            else if(s.equals("DOWN")){
9                i++;
10            }
11            else if(s.equals("RIGHT")){
12                j++;
13            }
14            else if(s.equals("LEFT")){
15                j--;
16            }
17        }
18        
19        return i*n+j;
20    }
21}