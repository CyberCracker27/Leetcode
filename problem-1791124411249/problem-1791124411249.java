// Last updated: 10/4/2026, 8:03:31 PM
1class Solution {
2    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
3        String s1="aceg";
4        String s2="bdfh";
5        char a=coordinate1.charAt(0);
6        char b=coordinate2.charAt(0);
7        int a1=Integer.valueOf(coordinate1.charAt(1)-'0');
8        int b2=Integer.valueOf(coordinate2.charAt(1)-'0');
9        boolean c1=false,c2=false;
10        if(s1.contains(String.valueOf(a))){
11            c1=a1%2!=0;
12        }else{
13            c1=a1%2==0;
14        }
15        if(s2.contains(String.valueOf(b))){
16            c2=b2%2==0;
17        }else{
18            c2=b2%2!=0;
19        }
20        return c1==c2;
21    }
22}