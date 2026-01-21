// Last updated: 21/01/2026, 22:08:41
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