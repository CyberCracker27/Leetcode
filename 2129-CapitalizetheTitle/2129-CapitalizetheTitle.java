// Last updated: 7/17/2026, 7:01:05 AM
1class Solution {
2    public String capitalizeTitle(String title) {
3        String[] arr=title.split(" ");
4        String s="";
5        int i=0;
6        for(String a:arr){
7            String b=a.toLowerCase();
8            if(b.length()<=2){
9                arr[i++]=b;
10            }else{
11                arr[i++]=b.substring(0,1).toUpperCase()+b.substring(1);
12            }
13        }
14        return String.join(" ",arr);
15    }
16}