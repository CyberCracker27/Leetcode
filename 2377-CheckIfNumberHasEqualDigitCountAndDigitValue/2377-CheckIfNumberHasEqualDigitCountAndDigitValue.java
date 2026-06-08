// Last updated: 6/8/2026, 8:48:22 PM
class Solution {
    public boolean digitCount(String nums) {
        for(int i=0;i<nums.length();i++){
            int c=0;
            char f=(char)(i+'0');
            for(int j=0;j<nums.length();j++){
                if(f==nums.charAt(j)){
                    c++;
                }
            }
            if(Integer.parseInt(String.valueOf(nums.charAt(i)))!=c){
                return false;
            }
        }
        return true;
    }
}