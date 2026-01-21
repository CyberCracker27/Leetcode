// Last updated: 21/01/2026, 22:09:02
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