// Last updated: 7/22/2026, 9:58:33 AM
1class Solution {
2    public int findGCD(int[] nums) {
3        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]>max){
6                max=nums[i];
7            }
8            if(nums[i]<min){
9                min=nums[i];
10            }
11        }
12        return gcd(max,min);
13    }
14    public int gcd(int a,int b){
15        if(b==0){
16            return a;
17        }
18        return gcd(b,a%b);
19    }
20}