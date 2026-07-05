// Last updated: 7/5/2026, 8:10:32 AM
1class Solution {
2    public int maxDigitRange(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int max1=0;
5        for(int i=0;i<nums.length;i++){
6            int max=0;
7            int min=Integer.MAX_VALUE;
8            int temp=nums[i];
9            while(temp!=0){
10                int d=temp%10;
11                max=Math.max(max,d);
12                min=Math.min(min,d);
13                temp/=10;
14            }
15            int c=max-min;
16            if(c>max1){
17                max1=c;
18            }
19            map.put(i,c);
20        }
21        int f=0;
22        for(int x:map.keySet()){
23            if(max1==map.get(x)){
24                f+=nums[x];
25            }
26        }
27        return f;
28    }
29}