// Last updated: 8/5/2026, 6:40:02 AM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        Set<Integer> a=new HashSet<>();
4        for(int x:candyType){
5            a.add(x);
6        }
7        int b=candyType.length/2;
8        if(a.size()>b){
9            return b;
10        }else{
11            return a.size();
12        }
13    }
14}