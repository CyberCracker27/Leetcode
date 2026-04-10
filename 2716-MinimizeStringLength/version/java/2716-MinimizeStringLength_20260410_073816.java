// Last updated: 10/04/2026, 07:38:16
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int max=-1;
4        for(int i=0;i<nums.length;i++){
5            int c=0;
6            for(int j=0;j+k<=nums.length;j++){
7                boolean l=false;
8                for(int f=j;f<j+k;f++){
9                    if(nums[i]==nums[f]){
10                        l=true;
11                        break;    
12                    }
13                }
14                if(l){
15                    c++;
16                }
17            }
18            if(c==1 && nums[i]>max){
19                max=nums[i];
20            }
21        }
22        return max;
23    }
24}