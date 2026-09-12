// Last updated: 9/12/2026, 7:35:03 AM
class Solution {
    public int maxPower(String s) {
        int lar=1;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            int d=1;
            for (int j = i + 1; j < s.length(); j++) {
                if(c==s.charAt(j)){
                    d++;
                }else{
                    break;
                }
            }
            if(d>lar){
                lar=d;
            }
        }
        return lar;
    }
}