// Last updated: 11/03/2026, 07:17:40
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum=0;
4        for(int i=0;i<arr.length;i++){
5            int ans=0;
6            int count=0;
7            for(int j=i;j<arr.length;j++){
8                ans+=arr[j];
9                count++;
10                if(count%2!=0){
11                    sum+=ans;
12                }
13            }
14        }
15        return sum;
16    }
17}