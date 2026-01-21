// Last updated: 21/01/2026, 22:08:48
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 &&nums[i]%3==0){
                sum+=nums[i];
                c++;
            }
        }
        if(c==0){
            return 0;
        }
        int avg=sum/c;
        System.out.println(avg);
        return avg;
    }
}