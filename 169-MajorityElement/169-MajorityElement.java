// Last updated: 6/2/2026, 10:18:57 AM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        Map<Integer,Integer> frq=new HashMap<>();
4        List<Integer> a=new ArrayList<>();
5        int n=nums.length;
6        for(int i=0;i<n;i++){
7            frq.put(nums[i],frq.getOrDefault(nums[i],0)+1);
8        }
9        int c=n/3;
10        for(int x:frq.keySet()){
11            if(frq.get(x)>c){
12                a.add(x);
13            }
14        }
15        if(a.size()==0 && nums.length>=3){
16            return a;
17        }
18        if(a.size()==0){
19            for(int i=0;i<nums.length;i++){
20                a.add(nums[i]);
21            }
22            return a;
23        }
24        else{
25            return a;
26        }
27    }
28}