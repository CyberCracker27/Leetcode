// Last updated: 6/12/2026, 3:46:58 PM
1class Solution {
2    public String getPermutation(int n, int k) {
3        List<Integer> arr=new ArrayList<>();
4        int f=1;
5        for(int i=1;i<=n;i++){
6            arr.add(i);
7            f*=i;
8        }
9        f/=n;
10        k-=1;
11        String s="";
12        while(n>0){
13            int i=k/f;
14            s=s+arr.get(i);
15            arr.remove(i);
16            n-=1;
17            k%=f;
18            if(n!=0) f/=n;
19        }
20        return s;
21    }
22}