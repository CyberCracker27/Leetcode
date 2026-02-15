// Last updated: 15/02/2026, 09:07:16
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        HashMap<Integer,Integer> a=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
6        }
7        HashMap<Integer,Integer> b=new HashMap<>();
8        for(int value:a.values()){
9            b.put(value,b.getOrDefault(value,0)+1);
10        }
11        int d=-1;
12        for(int i=0;i<nums.length;i++){
13            int key=nums[i];
14            int va=a.get(key);
15            if(b.get(va)==1){
16                return key;
17            }
18        }
19        return d;
20    }
21}