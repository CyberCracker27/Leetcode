// Last updated: 10/13/2026, 6:59:43 AM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int x=nums[i];
5            int sum=0;
6            while(x!=0){
7                sum+=x%10;
8                x/=10;
9            }
10            if(sum==i){
11                return i;
12            }
13        }
14        return -1;
15    }
16}