// Last updated: 9/30/2026, 6:51:47 AM
1class Solution {
2    public String[] findWords(String[] words) {
3        String s1="qwertyuiopQWERTYUIOP";
4        String s2="asdfghjklASDFGHJKL";
5        String s3="zxcvbnmZXCVBNM";
6        List<String> ds=new ArrayList<>();
7        for(String s:words){
8            boolean f=true;
9            for(char a:s.toCharArray()){
10                if(s1.indexOf(s.charAt(0))!=-1 && s1.indexOf(a)==-1){
11                    f=false;
12                }
13                if(s2.indexOf(s.charAt(0))!=-1&& s2.indexOf(a)==-1){
14                    f=false;
15                }
16                if(s3.indexOf(s.charAt(0))!=-1 && s3.indexOf(a)==-1){
17                    f=false;
18                }
19            }
20            if(f){
21                ds.add(s);
22            }
23        }
24        String arr[]=new String[ds.size()];
25        int j=0;
26        for(String i:ds){
27            arr[j++]=i;
28        }
29        return arr;
30    }
31}