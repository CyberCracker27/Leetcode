// Last updated: 7/16/2026, 6:49:08 AM
1class Solution {
2    public long gcdSum(int[] nums) {
3        long max=0;
4        long arr[]=new long[nums.length];
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>max){
7                max=nums[i];
8            }
9            arr[i]=gcd(max,nums[i]);
10        }
11        Arrays.sort(arr);
12        int left=0,right=nums.length-1;
13        long sum=0;
14        while(left<right){
15            sum+=gcd(arr[left],arr[right]);
16            left++;
17            right--;
18        }
19        return sum;
20    }
21    public long gcd(long a,long b){
22        if(b==0){
23            return a;
24        }
25        return gcd(b,a%b);
26    }
27}