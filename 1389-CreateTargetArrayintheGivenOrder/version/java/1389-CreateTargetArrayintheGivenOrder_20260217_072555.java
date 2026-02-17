// Last updated: 17/02/2026, 07:25:55
1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        ArrayList<Integer> a=new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            a.add(index[i],nums[i]);
6        }
7        int[] target=new int[nums.length];
8        for(int i=0;i<nums.length;i++){
9            target[i]=a.get(i);
10        }
11        return target;
12    }
13}