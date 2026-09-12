// Last updated: 9/12/2026, 7:34:02 AM
class Solution {
    public int xorOperation(int n, int start) {
        int a=start;
        for(int i=1;i<n;i++){
            int b=start+2*i;
            a=a^b;
        }
        return a;
    }
}