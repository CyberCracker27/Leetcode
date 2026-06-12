// Last updated: 6/12/2026, 10:42:08 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> ans =new ArrayList<>();
4        List<Integer> temp=new ArrayList<>();
5        method(ans,n,k,temp,1);
6        return ans;
7    }
8    public void method(List<List<Integer>> ans,int n,int k,List<Integer> temp,int start){
9        if(temp.size()==k){
10            ans.add(new ArrayList<>(temp));
11            return;
12        }
13        for(int i=start;i<=n;i++){
14            temp.add(i);
15            method(ans,n,k,temp,i+1);
16            temp.remove(temp.size()-1);
17        }
18    }
19}