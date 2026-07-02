// Last updated: 7/2/2026, 11:20:30 AM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        List<Integer> li1=new ArrayList<>();
4        List<Integer> li2=new ArrayList<>();
5        List<Integer> li3=new ArrayList<>();
6        for(int x:nums){
7            if(x<pivot){
8                li1.add(x);
9            }else if(x==pivot){
10                li3.add(x);
11            }else{
12                li2.add(x);
13            }
14        }
15        int arr[]=new int[nums.length];
16        int i=0;
17        for(int x:li1){
18            arr[i++]=x;
19        }
20        for(int x:li3){
21            arr[i++]=x;
22        }
23        for(int x:li2){
24            arr[i++]=x;
25        }
26        return arr;
27    }
28}