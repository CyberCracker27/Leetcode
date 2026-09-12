// Last updated: 9/12/2026, 7:35:09 AM
class Solution {
    public int maxScore(String s) {
        int c=0;
        int d=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                d++;
            }
            
        }
        for(int j=0;j<s.length()-1;j++){
            if(s.charAt(j)=='0'){
                c++;
            }else{
                d--;
            }
            if(c+d>sum){
                sum=c+d;
            }
        }
        return sum;
    }
}