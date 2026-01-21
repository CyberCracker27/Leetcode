// Last updated: 21/01/2026, 22:10:38
class Solution {
    public void reverseString(char[] s) {
       int left=0;
       int right=s.length-1;
       while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
       } 
    }
}