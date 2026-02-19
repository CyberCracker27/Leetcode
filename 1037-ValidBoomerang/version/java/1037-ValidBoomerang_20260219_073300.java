// Last updated: 19/02/2026, 07:33:00
1class Solution {
2    public boolean isBoomerang(int[][] p) {
3        return (p[1][1]-p[0][1])*(p[2][0]-p[1][0]) != (p[2][1]-p[1][1])*(p[1][0]-p[0][0]);
4    }
5}