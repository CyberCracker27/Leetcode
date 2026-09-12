// Last updated: 9/12/2026, 7:30:51 AM
class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            max=Math.max(max,n.charAt(i)-'0');
        }
        return max;
    }
}