// Last updated: 25/02/2026, 07:59:43
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int[] a=new int[nums.length/2];
4        int[] b=new int[nums.length/2];
5        int[] c=new int[nums.length];
6        int a1=0,b1=0;
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]%2==0){
9                b[b1++]=nums[i];
10            }else{
11                a[a1++]=nums[i];
12            }
13        }
14        for(int i=0;i<nums.length;i+=2){
15            c[i]=b[i/2];
16            c[i+1]=a[i/2];
17        }
18        return c;
19    }
20}