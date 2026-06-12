// Last updated: 6/12/2026, 2:22:10 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> temp=new ArrayList<>();
5        ans.add(new ArrayList<>(temp));
6        method(ans,temp,nums,0);
7        return ans;
8    }
9    public void method(List<List<Integer>> ans,List<Integer> temp,int[] nums,int start){
10        
11        for(int i=start;i<nums.length;i++){
12            temp.add(nums[i]);
13            ans.add(new ArrayList<>(temp));
14            method(ans,temp,nums,i+1);
15        }
16        if(temp.size()>0)
17        temp.remove(temp.size()-1);
18    }
19}