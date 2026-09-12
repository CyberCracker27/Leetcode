// Last updated: 9/12/2026, 7:36:47 AM
class Solution {
    public boolean checkStraightLine(int[][] c) {
        int x0=c[0][0];
        int y0=c[0][1];
        int x1=c[1][0];
        int y1=c[1][1];
        for(int i=2;i<c.length;i++){
            int x=c[i][0];
            int y=c[i][1];
            if((x-x0)*(y1-y0)!=(y-y0)*(x1-x0)){
                return false;
            }
        }
        return true;
    }
}