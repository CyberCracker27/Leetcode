// Last updated: 6/5/2026, 3:43:49 PM
1class Solution {
2    public int rob(int[] nums) {
3        int a=0,b=0,m1=0,m2=0;
4        for(int i=0;i<nums.length-1;i++){
5            m1=Math.max(a,b+nums[i]);
6            b=a;
7            a=m1;
8        }
9        a=0;
10        b=0;
11        for(int i=1;i<nums.length;i++){
12            m2=Math.max(a,b+nums[i]);
13            b=a;
14            a=m2;
15        }
16        if(nums.length<=2){
17            if(nums.length==1) return nums[0];
18            if(nums[0]>nums[1]){
19                return nums[0];
20            }else{
21                return nums[1];
22            }
23        }
24        return (m1>m2)?m1:m2;
25    }
26}