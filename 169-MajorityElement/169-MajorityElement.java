// Last updated: 6/2/2026, 10:04:09 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        Map<Integer,Integer> frq=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            frq.put(nums[i],frq.getOrDefault(nums[i],0)+1);
6        }
7        int max=0;
8        int c=0;
9        for(int x:frq.keySet()){
10            if(frq.get(x)>max){
11                max=frq.get(x);
12                c=x;
13            }
14        }
15        return c;
16    }
17}