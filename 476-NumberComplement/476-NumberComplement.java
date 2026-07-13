// Last updated: 7/13/2026, 8:52:01 PM
class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        int bl=Integer.toBinaryString(num).length();
        int x=(1<<bl)-1;
        return num^x;
    }
}