// Last updated: 7/2/2026, 11:06:10 AM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int f=0;
4        for(int i=0;i<nums.size()-1;i++){
5            int c=nums.get(i);
6            for(int j=i+1;j<nums.size();j++){
7                c+=nums.get(j);
8                if(c<target){
9                    f++;
10                }
11                c=nums.get(i);
12            }
13            
14        }
15        return f;
16    }
17}