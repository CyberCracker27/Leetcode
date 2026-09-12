// Last updated: 9/12/2026, 7:24:51 AM
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        String result=key.replace("\\s+","");
        char a='a';
        for(int i=0;i<result.length();i++){
            char ch=result.charAt(i);
            if(ch!=' ' && !map.containsKey(ch)){
                map.put(ch,a++);
            }
        }
        StringBuilder fi=new StringBuilder();
        for(int i=0;i<message.length();i++){
            char g=message.charAt(i);
            if(g==' '){
                fi.append(g);
            }else{
                fi.append(map.get(g));
            }
        }
        return fi.toString();
    }
}