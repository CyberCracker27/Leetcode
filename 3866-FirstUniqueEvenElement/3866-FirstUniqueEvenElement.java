// Last updated: 9/7/2026, 6:50:58 AM
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int x:nums){
5            if(x%2==0){
6                map.put(x,map.getOrDefault(x,0)+1);
7            }
8        }
9        for(int x:nums){
10            if(x%2==0 && map.get(x)==1){
11                return x;
12            }
13        }
14        return -1;
15    }
16}