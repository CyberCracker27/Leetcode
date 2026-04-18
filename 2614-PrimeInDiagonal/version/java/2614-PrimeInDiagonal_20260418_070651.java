// Last updated: 18/04/2026, 07:06:51
1class Solution {
2    public int diagonalPrime(int[][] nums) {
3        int i=0,j=nums.length-1;
4        int max=0;
5        while(j>=0){
6            if(isprime(nums[i][j])){
7                if(nums[i][j]>max){
8                    max=nums[i][j];
9                }
10            }
11            i++;
12            j--;
13        }
14        for(int k=0;k<nums.length;k++){
15            for(int l=0;l<nums.length;l++){
16                if(k==l){
17                    if(isprime(nums[k][l])){
18                        if(nums[k][l]>max){
19                            max=nums[k][l];
20                        }
21                    }
22                }
23            }
24        }
25        return max;
26    }
27    public boolean isprime(int n){
28        if(n<2){
29            return false;
30        }
31        for(int i=2;i*i<=n;i++){
32            if(n%i==0){
33                return false;
34            }
35        }
36        return true;
37    }
38}