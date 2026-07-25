// Last updated: 7/25/2026, 7:10:22 AM
1class Solution {
2    public int maxProduct(int n) {
3        List<Integer> li=new ArrayList<>();
4        while(n!=0){
5            li.add(n%10);
6            n/=10;
7        }
8        int max=0;
9        for(int i=0;i<li.size();i++){
10            for(int j=i+1;j<li.size();j++){
11                if(li.get(i)*li.get(j)>max){
12                    max=li.get(i)*li.get(j);
13                }
14            }
15        }
16        return max;
17    }
18}