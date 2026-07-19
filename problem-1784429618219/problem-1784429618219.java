// Last updated: 7/19/2026, 8:23:38 AM
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        int s=(start[0]+start[1])%2;
4        int e=(target[0]+target[1])%2;
5        return s==e;
6    }
7}