// Last updated: 9/3/2026, 7:01:04 AM
1class Solution {
2    public boolean uniformArray(int[] nums) {
3        int smallestodd=Integer.MAX_VALUE;
4        for(int num:nums){
5            if(num%2==1){
6                smallestodd=Math.min(smallestodd,num);
7            }
8        }
9        if(smallestodd==Integer.MAX_VALUE){
10            return true;
11        }
12        for(int num:nums){
13            if(num%2==0 && num<=smallestodd){
14                return false;
15            }
16        }
17        return true;
18    }
19}