// Last updated: 7/17/2026, 6:45:11 AM
class Solution {
    public long gcdSum(int[] nums) {
        long max=0;
        long arr[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            arr[i]=gcd(max,nums[i]);
        }
        Arrays.sort(arr);
        int left=0,right=nums.length-1;
        long sum=0;
        while(left<right){
            sum+=gcd(arr[left],arr[right]);
            left++;
            right--;
        }
        return sum;
    }
    public long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}