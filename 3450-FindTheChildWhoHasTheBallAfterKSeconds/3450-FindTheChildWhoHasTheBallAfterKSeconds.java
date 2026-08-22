// Last updated: 8/22/2026, 6:55:44 AM
class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int ron=k/n;
        int rem=k%n;
        if(ron%2==0){
            return rem;
        }else{
            return n-rem;
        }
    }
}