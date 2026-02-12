// Last updated: 12/02/2026, 07:36:41
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int j=0;
4        int f=0;
5        while(true){
6            j++;
7            boolean a=true;
8            for(int i=0;i<arr.length;i++){
9                if(j==arr[i]){
10                    a=false;
11                    break;
12                }
13            }
14            if(a){
15                f++;
16            }
17            if(f==k){
18                return j;
19            }
20        }
21    }
22}