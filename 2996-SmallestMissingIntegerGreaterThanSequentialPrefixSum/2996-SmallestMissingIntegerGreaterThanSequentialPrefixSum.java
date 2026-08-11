// Last updated: 8/11/2026, 6:47:20 AM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int n=nums.length;
4        Set<Integer> seen=new HashSet<>();
5        for(int x:nums){
6            seen.add(x);
7        }
8        int sum=nums[0];
9        for(int i=1;i<n;i++){
10            if(nums[i]==nums[i-1]+1){
11                sum+=nums[i];
12            }else{
13                break;
14            }
15        }
16        while(seen.contains(sum)){
17            sum++;
18        }
19        return sum;
20    }
21}