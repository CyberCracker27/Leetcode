// Last updated: 10/14/2026, 7:35:38 AM
1class Solution {
2    public long maxSum(int[][] grid, int[] limits, int k) {
3        List<Integer> li = new ArrayList<>();
4
5        for (int i = 0; i < grid.length; i++) {
6            Arrays.sort(grid[i]);
7
8            int count = Math.min(limits[i], grid[i].length);
9
10            for (int j = grid[i].length - count;
11                 j < grid[i].length; j++) {
12                li.add(grid[i][j]);
13            }
14        }
15
16        li.sort(Collections.reverseOrder());
17
18        long sum = 0;
19
20        for (int i = 0; i < Math.min(k, li.size()); i++) {
21            if (li.get(i) <= 0) {
22                break;
23            }
24            sum += li.get(i);
25        }
26
27        return sum;
28    }
29}
30