// Last updated: 9/26/2026, 9:46:17 AM
1class Solution {
2    public List<String> printVertically(String s) {
3        String arr[]=s.split(" ");
4        List<String> li=new ArrayList<>();
5        int max=0;
6        for(String dr:arr){
7            if(dr.length()>max){
8                max=dr.length();
9            }
10        }
11        for(int i=0;i<max;i++){
12            StringBuilder st=new StringBuilder();
13            for(int j=0;j<arr.length;j++){
14                if(i<arr[j].length()){
15                    st.append(arr[j].charAt(i));
16                }else{
17                    st.append(" ");
18                }
19            }
20            li.add(st.toString().stripTrailing());
21        }
22        return li;
23    }
24}