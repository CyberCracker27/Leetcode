// Last updated: 9/1/2026, 6:51:49 AM
1class Solution {
2    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
3        int m=nums1.length,n=nums2.length;
4        int i=0,j=0;
5        List<int[]> result=new ArrayList<>();
6        while(i<m && j<n){
7            if(nums1[i][0]==nums2[j][0]){
8                result.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
9                i++;
10                j++;
11            }
12            else if(nums1[i][0]<nums2[j][0]){
13                result.add(nums1[i]);
14                i++;
15            }
16            else{
17                result.add(nums2[j]);
18                j++;
19            }
20        }
21        while(i<m){
22            result.add(nums1[i]);
23            i++;
24        }
25        while(j<n){
26            result.add(nums2[j]);
27            j++;
28        }
29        return result.toArray(new int[result.size()][]);
30    }
31}