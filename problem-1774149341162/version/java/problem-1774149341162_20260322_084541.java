// Last updated: 22/03/2026, 08:45:41
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int odd=0;
4        int even=0;
5        for(int num:nums1){
6            if(num%2==0) even++;
7            else odd++;
8        }
9        if(odd==nums1.length || even==nums1.length){
10            return true;
11        }
12        return even>0 && odd>0;
13    }
14}