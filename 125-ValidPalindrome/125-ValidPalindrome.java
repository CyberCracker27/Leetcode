// Last updated: 21/01/2026, 22:11:13
class Solution {
    public boolean isPalindrome(String s) {
        String a=s.replaceAll("\\p{Punct}","");
        a=a.replaceAll("\\s+","");
        a=a.toLowerCase();
        StringBuilder c=new StringBuilder(a);
        String b=c.reverse().toString();
        if(a.equals(b)){
            return true;
        }else{
            return false;
        }
    }
}