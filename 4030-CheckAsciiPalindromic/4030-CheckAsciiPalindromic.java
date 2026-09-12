// Last updated: 9/12/2026, 7:16:02 AM
class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary=new StringBuilder();
        for(char c:s.toCharArray()){
            String bits=String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
            binary.append(bits);
        }
        String str=binary.toString();
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}