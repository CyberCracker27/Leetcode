// Last updated: 8/2/2026, 8:20:34 AM
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long max=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                int g=gcd(nums[i],nums[j]);
7                long d=(1L*nums[i]*nums[j])/(1L*g*g);
8                if(d>max){
9                    max=d;
10                }
11
12            }
13        }
14        return max;
15    }
16    public int gcd(int a,int b){
17        if(b==0){
18            return a;
19        }
20        return gcd(b,a%b);
21    }
22}