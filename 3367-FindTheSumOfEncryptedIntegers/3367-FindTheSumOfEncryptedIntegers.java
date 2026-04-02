// Last updated: 02/04/2026, 07:34:58
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum+=nums[i];
            }else{
                int temp=nums[i];
                int max=0;
                int c=0;
                while(temp!=0){
                    c++;
                    int digit=temp%10;
                    temp/=10;
                    if(digit>max){
                        max=digit;
                    }
                }
                while(c!=0){
                    temp=(temp*10)+max;
                    c--;
                }
                sum+=temp;
            }
        }
        return sum;
    }
}