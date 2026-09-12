// Last updated: 9/12/2026, 7:38:12 AM
class Solution {
    public boolean isBoomerang(int[][] p) {
        return (p[1][1]-p[0][1])*(p[2][0]-p[1][0]) != (p[2][1]-p[1][1])*(p[1][0]-p[0][0]);
    }
}