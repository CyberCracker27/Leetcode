// Last updated: 28/03/2026, 07:17:30
1class Solution {
2    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
3        int sum=0;
4        for(int i=0;i<nums.size();i++){
5            String s=Integer.toBinaryString(i);
6            int count=0;
7            for(int j=0;j<s.length();j++){
8                if(s.charAt(j)=='1'){
9                    count++;
10                }
11            }
12            if(count==k){
13                sum+=nums.get(i);
14            }
15        }
16        return sum;
17    }
18}