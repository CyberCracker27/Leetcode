// Last updated: 7/13/2026, 8:48:04 PM
class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd=numsDivide[0],temp=0;
        for(int a:numsDivide){
            while(a>0){
                temp=gcd%a;
                gcd=a;
                a=temp;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length && nums[i]<=gcd ; i++){
            if(gcd%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
}