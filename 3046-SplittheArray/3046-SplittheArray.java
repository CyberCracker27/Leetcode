// Last updated: 8/4/2026, 6:45:08 AM
1class Solution {
2    public boolean isPossibleToSplit(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int x:nums){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        for(int x:map.keySet()){
8            if(map.get(x)>2){
9                return false;
10            }
11        }
12        return true;
13    }
14}