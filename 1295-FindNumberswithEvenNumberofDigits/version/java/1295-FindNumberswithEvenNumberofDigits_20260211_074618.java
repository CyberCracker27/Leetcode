// Last updated: 11/02/2026, 07:46:18
1class Solution {
2    public int findNumbers(int[] nums) {
3        int b=0;
4        for(int i=0;i<nums.length;i++){
5            int a=nums[i];
6            int c=0;
7            while(a!=0){
8                a/=10;
9                c++;
10            }
11            if(c%2==0){
12                b++;
13            }
14        }
15        return b;
16    }
17}