// Last updated: 6/18/2026, 6:59:02 AM
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> a=new ArrayList<>();
4        for(int i=left;i<=right;i++){
5            int temp=i;
6            boolean f=true;
7            while(temp!=0){
8                int c=temp%10;
9                if(c==0 || i%c!=0){
10                    f=false;
11                    break;
12                }
13                temp/=10;
14            }
15            if(f){
16                a.add(i);
17            }
18        }
19        return a;
20    }
21}