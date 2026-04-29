// Last updated: 29/04/2026, 07:21:33
1class Solution {
2    public int[] distributeCandies(int candies, int num_people) {
3        int nums[]=new int[num_people];
4        int j=0;
5        int i=0;
6        while(candies>0){
7            j++;
8            i=i%num_people;
9            if(j<=candies){
10                nums[i++]+=j;
11            }else{
12                nums[i++]+=candies;
13            }
14            
15            candies-=j;
16        }
17        return nums;
18    }
19}