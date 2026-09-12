// Last updated: 9/12/2026, 7:19:50 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a=0,b=0;
        a=Math.abs(x-z);
        b=Math.abs(y-z);
        if(a>b){
            return 2;
        }else if(a==b){
            return 0;
        }else{
            return 1;
        }
    }
}