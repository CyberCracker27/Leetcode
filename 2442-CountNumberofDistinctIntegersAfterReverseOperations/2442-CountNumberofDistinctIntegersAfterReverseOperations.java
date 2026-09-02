// Last updated: 9/2/2026, 7:16:45 AM
1class Solution {
2    public int countDistinctIntegers(int[] nums) {
3        Set<Integer> li=new HashSet<>();
4        for(int x:nums){
5            li.add(x);
6            int rev=0;
7            while(x!=0){
8                rev = rev * 10 + x % 10;
9                x/=10;
10            }
11            li.add(rev);
12        }
13        return li.size();
14    }
15}