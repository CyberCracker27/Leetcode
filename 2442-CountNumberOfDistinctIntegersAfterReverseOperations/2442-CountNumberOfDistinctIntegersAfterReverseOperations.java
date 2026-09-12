// Last updated: 9/12/2026, 7:24:09 AM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> li=new HashSet<>();
        for(int x:nums){
            li.add(x);
            int rev=0;
            while(x!=0){
                rev = rev * 10 + x % 10;
                x/=10;
            }
            li.add(rev);
        }
        return li.size();
    }
}