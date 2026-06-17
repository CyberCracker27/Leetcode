// Last updated: 6/17/2026, 7:06:32 AM
1class Solution {
2    public int minElement(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            int temp=nums[i];
6            int c=0;
7            while(temp!=0){
8                c+=temp%10;
9                temp/=10;
10            }
11            if(c<min){
12                min=c;
13            }
14        }
15        return min;
16    }
17}