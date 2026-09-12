// Last updated: 9/12/2026, 7:25:07 AM
class Solution {
    public int countOperations(int num1, int num2) {
        int c=0;
        while(num1!=0 && num2!=0){
            c++;
            if(num1>num2){
                num1=num1-num2;
            }else if(num1<num2){
                num2=num2-num1;
            }
            else if(num1==num2){
                num1=num1-num2;
            }
        }
        return c;
    }
}