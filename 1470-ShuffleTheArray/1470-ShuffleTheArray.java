// Last updated: 9/12/2026, 7:34:14 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1=new int[nums.length];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr1[i]=nums[j++];
            }else{
                arr1[i]=nums[k+n];
                k++;
            }
        }
        return arr1;
    }
}