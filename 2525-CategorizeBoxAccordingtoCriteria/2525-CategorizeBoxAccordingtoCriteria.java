// Last updated: 7/23/2026, 7:09:14 AM
1class Solution {
2    public int maxLength(int[] nums) {
3        int max=0;
4        for(int i=0;i<nums.length;i++){
5            int resultgcd=nums[i];
6            int resultlcm=nums[i];
7            int pro=nums[i];
8            int c=1;
9            for(int j=i+1;j<nums.length;j++){
10                pro*=nums[j];
11                c++;
12                resultgcd=gcd(resultgcd,nums[j]);
13                resultlcm=lcm(resultlcm,nums[j]);
14                if(pro==resultgcd*resultlcm){
15                    if(c>max){
16                        max=c;
17                    }
18                }
19            }
20            
21        }
22        return max;
23    }
24    public int gcd(int a,int b){
25        if(b==0){
26            return a;
27        }
28        return gcd(b,a%b);
29    }
30    public int lcm(int a,int b){
31        if(a==0 || b==0){
32            return 0;
33        }
34        return Math.abs((a/gcd(a,b))*b);
35    }
36}