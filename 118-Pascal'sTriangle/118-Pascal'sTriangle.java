// Last updated: 7/11/2026, 7:04:30 AM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> li=new ArrayList<>();
4        for(int i=0;i<numRows;i++){
5            int number=1;
6            List<Integer> l=new ArrayList<>();
7            for(int j=0;j<=i;j++){
8                l.add(number);
9                number=number*(i-j)/(j+1);
10            }
11            li.add(l);
12        }
13        return li;
14    }
15}