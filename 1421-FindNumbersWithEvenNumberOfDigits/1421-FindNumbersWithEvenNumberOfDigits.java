// Last updated: 12/03/2026, 22:12:54
class Solution {
    public int findNumbers(int[] nums) {
        int b=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int c=0;
            while(a!=0){
                a/=10;
                c++;
            }
            if(c%2==0){
                b++;
            }
        }
        return b;
    }
}