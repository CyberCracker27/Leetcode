// Last updated: 9/12/2026, 7:20:37 AM
class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int c=0;
            while(temp!=0){
                c+=temp%10;
                temp/=10;
            }
            if(c<min){
                min=c;
            }
        }
        return min;
    }
}