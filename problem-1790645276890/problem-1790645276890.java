// Last updated: 9/29/2026, 6:57:56 AM
1class Solution {
2    public int numOfPairs(String[] nums, String target) {
3        int n=nums.length;
4        int c=0;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                if(i!=j){
8                    String s=nums[i]+nums[j];
9                    if(s.equals(target)){
10                        c++;
11                    }
12                }
13            }
14        }
15        return c;
16    }
17}