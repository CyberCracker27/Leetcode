// Last updated: 21/01/2026, 22:08:58
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