// Last updated: 9/12/2026, 7:23:04 AM
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max = -1;
        int a = 0;

        for(int i = 0; i < divisors.length; i++){
            int c = 0;

            for(int j = 0; j < nums.length; j++){
                if(nums[j] % divisors[i] == 0){
                    c++;
                }
            }

            if(c > max || (c == max && divisors[i] < divisors[a])){
                max = c;
                a = i;
            }
        }

        return divisors[a];
    }
}