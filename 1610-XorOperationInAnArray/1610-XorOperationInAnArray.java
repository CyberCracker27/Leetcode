// Last updated: 14/02/2026, 07:50:39
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