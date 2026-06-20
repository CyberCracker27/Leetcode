// Last updated: 6/20/2026, 7:31:35 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        List<Integer> a=new ArrayList<>();
4        for(int i=0;i<nums1.length;i++){
5            a.add(nums1[i]);
6        }
7        for(int i=0;i<nums2.length;i++){
8            a.add(nums2[i]);
9        }
10        Collections.sort(a);
11        if(a.size()%2==0){
12            int b=a.size()/2;
13            return (double)(a.get(b-1)+a.get(b))/2;
14        }else{
15            int c=a.size()/2;
16            return a.get(c);
17        }
18    }
19}