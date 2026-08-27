// Last updated: 8/27/2026, 6:58:11 AM
1class Solution {
2    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
3        List<Boolean> li=new ArrayList<>();
4        for(int i=0;i<l.length;i++){
5            boolean con=true;
6            List<Integer> li2=new ArrayList<>();
7            for(int j=l[i];j<=r[i];j++){
8                li2.add(nums[j]);
9            }
10            Collections.sort(li2);
11            System.out.print(li2);
12            int diff=li2.get(1)-li2.get(0);
13            for(int j=2;j<li2.size();j++){
14                if(li2.get(j)-li2.get(j-1)!=diff){
15                    con=false;
16                }
17            }
18            li.add(con);
19        }
20        return li;
21    }
22}