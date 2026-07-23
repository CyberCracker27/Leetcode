// Last updated: 7/23/2026, 2:59:13 PM
1class Solution {
2    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
3        Set<Integer> map1=new HashSet<>();
4        Set<Integer> map2=new HashSet<>();
5        List<List<Integer>> li2=new ArrayList<>();
6        for(int i=0;i<nums1.length;i++){
7            map1.add(nums1[i]);
8        }
9        for(int i=0;i<nums2.length;i++){
10            map2.add(nums2[i]);
11        }
12        List<Integer> li=new ArrayList<>();
13        for(int x:map1){
14            if(!map2.contains(x)){
15                li.add(x);
16            }
17        }
18        
19        li2.add(li);
20        li=new ArrayList<>();
21        for(int x:map2){
22            if(!map1.contains(x)){
23                li.add(x);
24            }
25        }
26        li2.add(li);
27        return li2;
28    }
29}