// Last updated: 12/03/2026, 22:13:08
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