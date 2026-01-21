// Last updated: 21/01/2026, 22:10:49
import java.util.Collection;
class Solution {
    public boolean wordPattern(String pattern, String s) {
       String str[]=s.split(" ");
       Map<Character,String> ha =new HashMap<>();
       int i=0;
       boolean d=true;
       char f[]=pattern.toCharArray();
       if(f.length!=str.length){
        return false;
       }
       for(char c:pattern.toCharArray()){
        if(ha.containsKey(c)){
            if(ha.get(c).equals(str[i])){
                d=true;
            }else{
                return false;
            }
        }else{
            Collection<String> values = ha.values();
            for(String value:values){
                if(value.equals(str[i])){
                    return false;
                }
            }
            ha.put(c,str[i]);
        }
        i++;
       }
       return d;
    }
}