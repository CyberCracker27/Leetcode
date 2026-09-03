// Last updated: 9/3/2026, 7:29:36 AM
1class Solution {
2    public String decodeMessage(String key, String message) {
3        HashMap<Character,Character> map=new HashMap<>();
4        String result=key.replace("\\s+","");
5        char a='a';
6        for(int i=0;i<result.length();i++){
7            char ch=result.charAt(i);
8            if(ch!=' ' && !map.containsKey(ch)){
9                map.put(ch,a++);
10            }
11        }
12        StringBuilder fi=new StringBuilder();
13        for(int i=0;i<message.length();i++){
14            char g=message.charAt(i);
15            if(g==' '){
16                fi.append(g);
17            }else{
18                fi.append(map.get(g));
19            }
20        }
21        return fi.toString();
22    }
23}