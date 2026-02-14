// Last updated: 14/02/2026, 07:48:36
1class Solution {
2    public int findLucky(int[] arr) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int n:arr){
5            map.put(n,map.getOrDefault(n,0)+1);
6        }
7        int a=-1;
8        for(int key : map.keySet()){
9            if(map.get(key)==key){
10                a=key;
11            }
12        }
13        return a;
14    }
15}