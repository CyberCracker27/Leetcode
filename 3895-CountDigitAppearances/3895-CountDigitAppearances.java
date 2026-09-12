// Last updated: 9/12/2026, 7:17:04 AM
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int n:nums){
            while(n!=0){
                int t=n%10;
                if(t==digit) c++;
                n/=10;
            }
        }
        return c;
    }
}