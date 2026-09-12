// Last updated: 9/12/2026, 7:39:18 AM
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