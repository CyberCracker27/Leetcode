// Last updated: 6/4/2026, 1:34:50 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
4        List<int[]> li=new ArrayList<>();
5        int prev[]=intervals[0];
6        for(int i=1;i<intervals.length;i++){
7            int[] interval=intervals[i];
8            if(interval[0]<=prev[1]){
9                prev[1]=Math.max(prev[1],interval[1]);
10            }
11            else{
12                li.add(prev);
13                prev=interval;
14            }
15        }
16        li.add(prev);
17        return li.toArray(new int[li.size()][]);
18    }
19}