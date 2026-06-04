// Last updated: 6/4/2026, 2:12:21 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> li=new ArrayList<>();
4        Set<Integer> s=new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            s.add(nums[i]);
7        }
8        for(int i=1;i<=nums.length;i++){
9            if(!s.contains(i)){
10                li.add(i);
11            }
12        }
13        return li;
14    }
15}