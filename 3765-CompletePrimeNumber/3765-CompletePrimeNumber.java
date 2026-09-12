// Last updated: 9/12/2026, 7:18:37 AM
class Solution {
    public boolean completePrime(int num) {
        if(num<10) return isprime(num);
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            String su=s.substring(0,i+1);
            int pre=Integer.parseInt(su);
            if(!isprime(pre)){
                return false;
            }
        }
        for(int i=0;i<s.length();i++){
            String su=s.substring(i,s.length());
            int pre=Integer.parseInt(su);
            if(!isprime(pre)){
                return false;
            }
        }
        return true;
    }
    public boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}