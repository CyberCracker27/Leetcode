// Last updated: 9/12/2026, 7:24:42 AM
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