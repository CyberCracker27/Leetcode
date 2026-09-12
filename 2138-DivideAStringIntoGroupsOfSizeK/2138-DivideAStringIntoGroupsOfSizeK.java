// Last updated: 9/12/2026, 7:25:27 AM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        double a=(double)(s.length());
        String st[]=new String[(int)Math.ceil(a/k)];
        int j=0;
        for(int i=0;i<s.length();i+=k){
            if(i+k<=s.length()){
                st[j++]=s.substring(i,i+k); 
            }else{
                StringBuilder sr=new StringBuilder();
                int o=0;
                for(int l=i;l<s.length();l++){
                    sr.append(s.charAt(l));
                    o++;
                }
                while(o<k){
                    sr.append(fill);
                    o++;
                }
                st[j++]=sr.toString();
            }
        }
        return st;
    }
}