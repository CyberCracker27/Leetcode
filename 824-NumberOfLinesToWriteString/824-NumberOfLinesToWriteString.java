// Last updated: 21/01/2026, 22:09:50
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int c=1;
        int temp=0;
        for(int i=0;i<s.length();i++){
            sum+=widths[s.charAt(i)-'a'];
            if(sum>100){
                sum=widths[s.charAt(i)-'a'];
                c++;
            }
        }
        return new int[]{c,sum};
    }
}