// Last updated: 9/2/2026, 6:58:07 AM
1class Solution {
2    public int triangularSum(int[] nums) {
3        List<Integer> li=new ArrayList<>();
4        List<Integer> li1=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            li.add(nums[i]);
7            li1.add(nums[i]);
8        }
9        while(li1.size()!=1){
10            li1=new ArrayList<>();
11            for(int i=0;i<li.size()-1;i++){
12                int a=li.get(i)+li.get(i+1);
13                li1.add(a%10);
14            }
15            li=new ArrayList<>();
16            for(int i=0;i<li1.size();i++){
17                li.add(li1.get(i));
18            }
19        }
20        return li1.get(0);
21    }
22}