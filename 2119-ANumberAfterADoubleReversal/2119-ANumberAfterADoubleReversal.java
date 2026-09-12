// Last updated: 9/12/2026, 7:25:43 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0;
        int temp=num;
        while(num>0){
            int digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }
        while(rev>0){
            int digit=rev%10;
            num=(num*10)+digit;
            rev/=10;
        }
        if(num==temp){
            return true;
        }
        else{
            return false;
        }
    }
}