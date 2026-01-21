// Last updated: 21/01/2026, 22:08:25
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num1+=i;
            }else{
                num2+=i;
            }
        }
        int c=num2-num1;
        return c;
    }
}