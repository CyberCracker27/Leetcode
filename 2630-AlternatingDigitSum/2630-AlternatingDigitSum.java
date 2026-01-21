// Last updated: 21/01/2026, 22:08:38
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