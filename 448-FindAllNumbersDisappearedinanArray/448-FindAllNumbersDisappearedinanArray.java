// Last updated: 6/4/2026, 3:55:23 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        int c=0;
4        Deque<Integer> s=new ArrayDeque<>();
5        for(String i:tokens){
6            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
7                int b=s.pop();
8                int a=s.pop();
9                if(i.equals("+")){
10                    c=a+b;
11                }else if(i.equals("-") ){
12                    c=a-b;
13                }else if(i.equals("*")){
14                    c=a*b;
15                }else{
16                    c=a/b;
17                }
18                s.push(c);
19
20            }else{
21                s.push(Integer.valueOf(i));
22            }
23        }
24        return (tokens.length>1)?c:Integer.valueOf(tokens[0]);
25    }
26}