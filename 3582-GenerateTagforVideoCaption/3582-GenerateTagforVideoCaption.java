// Last updated: 7/21/2026, 6:50:38 AM
1class Solution {
2    public String generateTag(String caption) {
3        StringBuilder s=new StringBuilder();
4        String arr[]=caption.trim().split("\\s+");
5        s.append("#");
6        for(int i=0;i<arr.length;i++){
7            if(i==0){
8                s.append(arr[i].toLowerCase());
9            }else{
10                s.append(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase());
11            }
12        }
13        String fin=s.toString();
14        if(fin.length()>100){
15            return fin.substring(0,100);
16        }
17        return s.toString();
18    }
19}