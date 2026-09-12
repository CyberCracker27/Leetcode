// Last updated: 9/12/2026, 7:20:28 AM
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