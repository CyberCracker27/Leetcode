// Last updated: 21/01/2026, 22:10:05
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int a[]=new int[2*(nums.length)];
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[i+nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            b[i]=-1;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>nums[i]){
                    b[i]=a[j];
                    break;
                }
            }
        }
        return b;
    }
}