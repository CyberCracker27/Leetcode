// Last updated: 9/12/2026, 7:25:14 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int neg[]=new int[n/2];
        int pos[]=new int[n/2];
        int k=0,j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[k++]=nums[i];
            }else{
                neg[j++]=nums[i];
            }
        }
        k=0;
        j=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[k++];
            }else{
                nums[i]=neg[j++];
            }
        }
        return nums;
    }
}