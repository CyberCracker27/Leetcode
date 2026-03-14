// Last updated: 14/03/2026, 07:26:30
1class Solution {
2    public int maxDivScore(int[] nums, int[] divisors) {
3        int max = -1;
4        int a = 0;
5
6        for(int i = 0; i < divisors.length; i++){
7            int c = 0;
8
9            for(int j = 0; j < nums.length; j++){
10                if(nums[j] % divisors[i] == 0){
11                    c++;
12                }
13            }
14
15            if(c > max || (c == max && divisors[i] < divisors[a])){
16                max = c;
17                a = i;
18            }
19        }
20
21        return divisors[a];
22    }
23}