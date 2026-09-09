// Last updated: 9/9/2026, 6:57:27 AM
1class Solution {
2    public int numberOfBeams(String[] bank) {
3        int ans=0,prev=0;
4        int n=bank[0].length();
5        for(int i=0;i<bank.length;i++){
6            int dev=0;
7            for(int j=0;j<n;j++){
8                dev+=(bank[i].charAt(j))=='1'?1:0;
9            }
10            if(dev>0){
11                ans+=dev*prev;
12                prev=dev;
13            }
14        }
15        return ans;
16    }
17}