// Last updated: 8/4/2026, 6:41:00 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> a=new ArrayList<>();
4        Arrays.sort(nums);
5        int j=0;
6        for(int i=nums[0];i<nums[nums.length - 1];i++){
7            if(i!=nums[j]){
8                a.add(i);
9                continue;
10            }
11            j++;
12        }
13        return a;
14    }
15}