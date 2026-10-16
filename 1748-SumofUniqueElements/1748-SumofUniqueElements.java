// Last updated: 10/16/2026, 7:12:18 AM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int c=0;
8        for(int x:map.keySet()){
9            if(map.get(x)==1){
10                c+=x;
11            }
12        }
13        return c;
14    }
15}