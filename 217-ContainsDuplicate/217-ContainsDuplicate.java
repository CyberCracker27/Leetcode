// Last updated: 21/01/2026, 22:10:59
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> n=new HashSet<>();
        boolean c=false;
        for(int a:nums){
            if(!n.add(a)){
                c=true;
            }
        }
        return c;
    }
}