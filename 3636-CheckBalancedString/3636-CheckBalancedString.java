// Last updated: 7/13/2026, 8:46:46 PM
class Solution {
    public boolean isBalanced(String num) {
        int odd=0,even=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                even+=Integer.valueOf(String.valueOf(num.charAt(i)));
            }else{
                odd+=Integer.valueOf(String.valueOf(num.charAt(i)));
            }
        }
        if(odd==even){
            return true;
        }else{
            return false;
        }
    }
}