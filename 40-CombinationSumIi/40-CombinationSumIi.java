// Last updated: 7/13/2026, 8:55:08 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        method(ans,candidates,target,temp,0);

        return ans;
    }
    public void method(List<List<Integer>> ans,int[] candidates,int target,List<Integer> temp,int start){
        int temp1=0;
        for(int x:temp){
            temp1+=x;
        }
        if(temp1==target){
            if(!ans.contains(temp))
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(temp1>target) return;
        for(int i=start;i<candidates.length;i++){
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            temp.add(candidates[i]);
            method(ans,candidates,target,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}