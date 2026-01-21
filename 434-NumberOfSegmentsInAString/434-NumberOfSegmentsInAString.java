// Last updated: 21/01/2026, 22:10:12
class Solution {
    public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.trim()==""){
            return 0;
        }
        String d[]=s.trim().split("\\s+");
        return d.length;
    }
}