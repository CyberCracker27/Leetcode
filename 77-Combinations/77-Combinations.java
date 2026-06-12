// Last updated: 6/12/2026, 11:43:23 AM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> temp=new ArrayList<>();
5        Arrays.sort(candidates);
6        method(ans,candidates,target,temp,0);
7
8        return ans;
9    }
10    public void method(List<List<Integer>> ans,int[] candidates,int target,List<Integer> temp,int start){
11        int temp1=0;
12        for(int x:temp){
13            temp1+=x;
14        }
15        if(temp1==target){
16            if(!ans.contains(temp))
17            ans.add(new ArrayList<>(temp));
18            return;
19        }
20        if(temp1>target) return;
21        for(int i=start;i<candidates.length;i++){
22            if (i > start && candidates[i] == candidates[i - 1]) {
23                continue;
24            }
25            temp.add(candidates[i]);
26            method(ans,candidates,target,temp,i+1);
27            temp.remove(temp.size()-1);
28        }
29    }
30}