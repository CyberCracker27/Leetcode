// Last updated: 6/6/2026, 2:42:01 PM
1class Solution {
2    public int[] exclusiveTime(int n, List<String> logs) {
3        int arr[]=new int[n];
4        Stack<Integer> st=new Stack<>();
5        int p=0;
6        for(String s:logs){
7            String part[]=s.split(":");
8            int i=Integer.parseInt(part[0]);
9            int t=Integer.parseInt(part[2]);
10            if(part[1].equals("start")){
11                if(!st.isEmpty()){
12                    arr[st.peek()]+=t-p;
13                }
14                st.push(i);
15                p=t;
16            }else{
17                arr[st.pop()]+=t-p+1;
18                p=t+1;
19            }
20        }
21        return arr;
22    }
23}