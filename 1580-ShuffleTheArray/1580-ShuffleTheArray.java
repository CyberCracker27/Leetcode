// Last updated: 21/01/2026, 22:09:28
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if((i+1)%2==0){
                a[i]=nums[n+i/2];
            }else{
                a[i]=nums[j++];
            }
        }
        return a;
    }
}