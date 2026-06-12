// Last updated: 6/12/2026, 1:31:21 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> temp=new ArrayList<>();
5        method(ans,nums,temp);
6        return ans;
7    }
8    public void method(List<List<Integer>> ans,int[] nums,List<Integer> temp){
9        if(temp.size()==nums.length){
10            ans.add(new ArrayList<>(temp));
11            return;
12        }
13        for(int i=0;i<nums.length;i++){
14            if(temp.contains(nums[i])) continue;
15            temp.add(nums[i]);
16            method(ans,nums,temp);
17            temp.remove(temp.size()-1);
18        }
19    }
20}