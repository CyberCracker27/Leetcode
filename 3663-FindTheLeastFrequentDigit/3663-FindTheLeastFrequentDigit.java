// Last updated: 7/2/2026, 3:08:43 PM
1class Solution {
2    public int getLeastFrequentDigit(int n) {
3        int min=Integer.MAX_VALUE; 
4        int c=0;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        while(n!=0){
7            int t=n%10;
8            map.put(t,map.getOrDefault(t,0)+1);
9            n/=10;
10        }
11        for(int x:map.keySet()){
12            if(map.get(x)<min){
13                min=map.get(x);
14                c=x;
15            }
16        }
17        return c;
18    }
19}