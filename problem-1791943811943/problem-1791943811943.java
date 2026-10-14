// Last updated: 10/14/2026, 7:40:11 AM
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int max=0;
5        int c=0;
6        for(int i=0;i<nums.length;i++){
7            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8            if(map.get(nums[i])>max){
9                max=map.get(nums[i]);
10            }
11        }
12        for(int x:map.keySet()){
13            if(map.get(x)==max){
14                c+=max;
15            }
16        }
17        return c;
18    }
19}