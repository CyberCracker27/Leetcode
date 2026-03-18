// Last updated: 18/03/2026, 07:21:27
1class Solution {
2    public int mostFrequentEven(int[] nums) {
3        HashMap<Integer,Integer> a=new HashMap<>();
4        int max=0;
5        int b=-1;
6        Arrays.sort(nums);
7        for(int i:nums){
8            a.put(i,a.getOrDefault(i,0)+1);
9        }
10        for(Integer i:a.keySet()){
11            if(i%2==0){
12                if(a.get(i)>max || (a.get(i)==max && i<b)){
13                    max=a.get(i);
14                    b=i;
15                }
16            }
17        }
18        return b;
19    }
20}