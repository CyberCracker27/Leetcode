// Last updated: 21/01/2026, 22:10:22
class Solution {
    public int firstUniqChar(String s) {
        char a[]=s.toCharArray();
        int c=-1;
        for(int i=0;i<a.length;i++){
            boolean b=true;
            for(int j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                if(a[i]==a[j]){
                    b=false;
                    break;
                }
            }
            if(b){
                c=i;
                break;
            }
        }
        return c;
    }
}