// Last updated: 9/12/2026, 7:18:50 AM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        int count=1;
        int  y=k;
        while(set.contains(y)){
            count++;
            y=k*count;
        }
        return y;
    }
}