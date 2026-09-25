// Last updated: 9/25/2026, 7:29:02 AM
1class Solution {
2    public int[] frequencySort(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int max=0;
5        for(int i=0;i<nums.length;i++){
6            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
7            if(map.get(nums[i])>max){
8                max=map.get(nums[i]);
9            }
10        }
11        int i=0;
12        int arr[]=new int[nums.length];
13        int freq=1;
14        while(freq<=max){
15            ArrayList<Integer> list=new ArrayList<>();
16            for(int c:map.keySet()){
17                if(map.get(c)==freq){
18                    list.add(c);
19                }
20            }
21            Collections.sort(list,Collections.reverseOrder());
22            for(int c:list){
23                for(int o=0;o<freq;o++){
24                    arr[i++]=c;
25                }
26            }
27            freq++;
28        }
29        
30        return arr;
31    }
32}