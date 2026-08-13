// Last updated: 8/13/2026, 7:02:23 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n=nums.length;
4        int neg[]=new int[n/2];
5        int pos[]=new int[n/2];
6        int k=0,j=0;
7        for(int i=0;i<n;i++){
8            if(nums[i]>=0){
9                pos[k++]=nums[i];
10            }else{
11                neg[j++]=nums[i];
12            }
13        }
14        k=0;
15        j=0;
16        for(int i=0;i<n;i++){
17            if(i%2==0){
18                nums[i]=pos[k++];
19            }else{
20                nums[i]=neg[j++];
21            }
22        }
23        return nums;
24    }
25}