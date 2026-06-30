// Last updated: 6/30/2026, 2:57:58 PM
1class Solution {
2    public int deleteGreatestValue(int[][] grid) {
3        List<List<Integer>> li=new ArrayList<>();
4        for (int[] row : grid) {
5            List<Integer> li1=new ArrayList<>();
6            for (int num : row) {
7                li1.add(num);
8            }
9            li.add(li1);
10        }
11        int c=0;
12        for(int i=0;i<grid[0].length;i++){
13            int max=0;
14            for(int j=0;j<li.size();j++){
15                List<Integer> l=li.get(j);
16                int x=Collections.max(l);
17                li.get(j).remove(Integer.valueOf(x));
18                if(x>max){
19                    max=x;
20                }
21            }
22            c+=max;
23        }
24        return c;
25    }
26}