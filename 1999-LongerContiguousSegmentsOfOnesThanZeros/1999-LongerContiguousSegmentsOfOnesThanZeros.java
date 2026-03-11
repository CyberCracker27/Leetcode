// Last updated: 11/03/2026, 07:19:45
class Solution {
    public boolean checkZeroOnes(String s) {
        int maxo=0;
        int maxz=0;
        int counto=0;
        int countz=0;
        for(char a:s.toCharArray()){
            if(a=='0'){
                countz++;
                counto=0;
                if(maxz<countz){
                    maxz=countz;
                }
            }
            else{
                counto++;
                countz=0;
                if(maxo<counto){
                    maxo=counto;
                }
            }
        }
        return maxo>maxz;
    }
}