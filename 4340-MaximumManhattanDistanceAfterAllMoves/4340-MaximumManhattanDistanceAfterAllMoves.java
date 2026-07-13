// Last updated: 7/13/2026, 8:45:40 PM
class Solution {
    public int maxDistance(String moves) {
        int a=0,b=0,c=0,d=0,e=0;
        for(char i:moves.toCharArray()){
            if(i=='U'){
                a++;
            }else if(i=='D'){
                b++;
            }else if(i=='L'){
                c++;
            }else if(i=='R'){
                d++;
            }else{
                e++;
            }
        }
        int x=d-c;
        int y=a-b;
        return Math.abs(x)+Math.abs(y)+e;
    }
}