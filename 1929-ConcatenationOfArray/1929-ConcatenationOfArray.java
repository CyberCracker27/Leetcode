// Last updated: 9/12/2026, 7:27:31 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr1=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            arr1[i]=nums[i];
            arr1[nums.length+i]=nums[i];
        }
        return arr1;
    }
}