// Last updated: 6/21/2026, 8:26:35 AM
1class Solution {
2    public int countValidSubarrays(int[] nums, int x) {
3        int ans=0;
4        for(int i=0;i<nums.length;i++){
5            long sum=0;
6            for(int j=i;j<nums.length;j++){
7                sum+=nums[j];
8                if(sum%10!=x) continue;
9                long temp=sum;
10                while(temp>=10){
11                    temp/=10;
12                }
13                if((int)temp==x)ans++;
14            }
15        }
16        return ans;
17    }
18}