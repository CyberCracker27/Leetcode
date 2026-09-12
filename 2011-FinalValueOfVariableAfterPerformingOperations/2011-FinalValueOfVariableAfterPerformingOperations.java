// Last updated: 9/12/2026, 7:26:36 AM
class Solution {
    public int finalValueAfterOperations(String[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i].equals("--X")){
                --c;
            }else if(nums[i].equals("++X")){
                ++c;
            }else if(nums[i].equals("X++")){
                c++;
            }else if(nums[i].equals("X--")){
                c--;
            }
        }
        return c;
    }
}