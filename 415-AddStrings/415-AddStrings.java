// Last updated: 21/01/2026, 22:10:14
class Solution {
    public String addStrings(String num1, String num2) {
        int c=(num1.length()>=num2.length())?num1.length():num2.length();
        String s="";
        int j=num1.length()-1;
        int k=num2.length()-1;
        int temp=0;
        for(int i=c-1;i>=0;i--){
            if(j>=0 && k>=0){
                int f=Integer.parseInt(String.valueOf(num1.charAt(j)))+Integer.parseInt(String.valueOf(num2.charAt(k)))+temp;
                temp=f/10;
                s=String.valueOf(f%10)+s;
            }else{
                if(j>=0){
                    int g=Integer.parseInt(String.valueOf(num1.charAt(j)))+temp;
                    temp=g/10;
                    s=String.valueOf(g%10)+s;
                }
                if(k>=0){
                    int g=Integer.parseInt(String.valueOf(num2.charAt(k)))+temp;
                    temp=g/10;
                    s=String.valueOf(g%10)+s;
                }
            }
            
            j--;
            k--;
        }
        if(temp!=0){
            s=String.valueOf(temp)+s;
        }
        return s;
    }
}