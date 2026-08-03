// Last updated: 8/3/2026, 9:22:52 AM
class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int g=gcd(nums[i],nums[j]);
                long d=(1L*nums[i]*nums[j])/(1L*g*g);
                if(d>max){
                    max=d;
                }

            }
        }
        return max;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}