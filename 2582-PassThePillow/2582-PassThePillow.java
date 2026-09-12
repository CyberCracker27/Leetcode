// Last updated: 9/12/2026, 7:23:23 AM
class Solution {
    public int passThePillow(int n, int time) {
        int div = time / (n-1);
        int rem = time % (n-1);

        if (rem == 0) {
            if (div % 2 == 0) {
                return 1; // Returns to the first person if even division
            } else {
                return n; // Returns to the last person if odd division
            }
        } 
        else {
            if (div % 2 == 0) {
                return 1 + rem; // Move forward if even division
            } else {
                return n - rem; // Move backward if odd division
            }
        }
    }
}