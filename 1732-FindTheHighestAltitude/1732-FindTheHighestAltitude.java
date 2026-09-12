// Last updated: 9/12/2026, 7:30:38 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int a=0;
        int b=0;
        for(int x:gain){
            b+=x;
            if(b>a){
                a=b;
            }
        }
        return a;
    }
}