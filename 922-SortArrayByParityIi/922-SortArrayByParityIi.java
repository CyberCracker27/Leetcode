// Last updated: 9/12/2026, 7:38:52 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] a=new int[nums.length/2];
        int[] b=new int[nums.length/2];
        int[] c=new int[nums.length];
        int a1=0,b1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                b[b1++]=nums[i];
            }else{
                a[a1++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i+=2){
            c[i]=b[i/2];
            c[i+1]=a[i/2];
        }
        return c;
    }
}