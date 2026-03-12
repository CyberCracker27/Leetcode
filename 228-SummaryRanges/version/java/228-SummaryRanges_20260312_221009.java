// Last updated: 12/03/2026, 22:10:09
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> result=new ArrayList<>();
4        if(nums.length==0) return result;
5        int num1=nums[0];
6        int num2=nums[0];
7        int i=0;
8        int c=0;
9        while(i<nums.length-1){
10            if(nums[i]+1==nums[i+1]){
11                num2=nums[i];
12                i++;
13                c++;
14            }else{
15                if(c==0){
16                    result.add(String.valueOf(num1));
17                }else{
18                    int n=num1+c;
19                    result.add(num1+"->"+n);
20                }
21                i++;
22                num1=nums[i];
23                num2=nums[i];
24                c=0;
25            }
26        }
27        if(c==0){
28            result.add(String.valueOf(num1));
29        }else{
30            int n=num1+c;
31            result.add(num1+"->"+n);
32        }
33        return result;
34    }
35}