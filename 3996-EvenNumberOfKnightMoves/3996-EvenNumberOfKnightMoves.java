// Last updated: 9/12/2026, 7:16:05 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int s=(start[0]+start[1])%2;
        int e=(target[0]+target[1])%2;
        return s==e;
    }
}