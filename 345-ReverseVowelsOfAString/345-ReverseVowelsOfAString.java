// Last updated: 21/01/2026, 22:13:33
class Solution {
    public String reverseVowels(String s) {
        String d="";
        for(char a:s.toCharArray()){
            if("AEIOUaeiou".contains(String.valueOf(a))){
                d=d+String.valueOf(a);
            }
        }
        StringBuilder sc=new StringBuilder(d);
        String b=sc.reverse().toString();
        char c[]=b.toCharArray();
        String e="";
        int i=0;
        for(char a:s.toCharArray()){
            if("AEIOUaeiou".contains(String.valueOf(a))){
                e=e+String.valueOf(c[i]);
                i++;
            }else{
                e=e+String.valueOf(a);
            }
        }
        return e;
    }
}