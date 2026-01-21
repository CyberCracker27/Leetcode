// Last updated: 21/01/2026, 22:09:13
class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int num[]=new int[2*a];
        for(int i=0;i<a;i++){
            num[i]=nums[i];
            num[(i+a)]=nums[i];
        }
        return num;
    }
}