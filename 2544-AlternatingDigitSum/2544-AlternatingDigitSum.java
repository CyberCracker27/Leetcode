// Last updated: 9/12/2026, 7:23:34 AM
class Solution {
    public int alternateDigitSum(int n) {
        String a=String.valueOf(n);
        int sum=0;
        for(int i=0;i<a.length();i++){
            if(i%2==0){
                sum+=Integer.parseInt(String.valueOf(a.charAt(i)));
            }else{
                sum-=Integer.parseInt(String.valueOf(a.charAt(i)));
            }
        }
        return sum;
    }
}