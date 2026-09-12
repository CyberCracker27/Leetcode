// Last updated: 9/12/2026, 7:23:39 AM
class Solution {
    public int countDigits(int num) {
        int temp=num;
        int c=0;
        while(num!=0){
            int digit=num%10;
            num/=10;
            if(temp%digit==0){
                c++;
            }
        }
        return c;
    }
}