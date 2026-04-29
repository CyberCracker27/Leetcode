// Last updated: 29/04/2026, 07:23:17
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] a=new int[code.length];
        if(k>0){
            for(int i=0;i<code.length;i++){
                int j=1;
                int c=0;
                while(j<=k){
                    c+=code[(i+j)%code.length];
                    j++;
                }
                a[i]=c;
            }
        }
        if(k<0){
             for(int i=0;i<code.length;i++){
                int j=-1;
                int c=0;
                while(j>=k){
                    c+=code[Math.abs(i+j+code.length)%code.length];
                    j--;
                }
                a[i]=c;
            }
        }
        return a;
    }
}