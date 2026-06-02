// Last updated: 6/2/2026, 8:54:16 PM
1class Solution {
2    public int arrayNesting(int[] nums) {
3        boolean[] v=new boolean[nums.length];
4        int max=0;
5        for(int i=0;i<nums.length;i++){
6            if(!v[i]){
7                int c=0;
8                int temp=i;
9                while(!v[temp]){
10                   v[temp] = true;
11                    temp = nums[temp];
12                    c++;
13                }
14                max=Math.max(max,c);
15            }
16        }
17        return max;
18        
19        
20    }
21}