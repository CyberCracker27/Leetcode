// Last updated: 9/23/2026, 7:12:31 AM
1class Solution {
2    public String complexNumberMultiply(String num1, String num2) {
3        String[] nums1=num1.split("\\+");
4        String[] nums2=num2.split("\\+");
5
6        StringBuilder s=new StringBuilder();
7        
8        int a=Integer.parseInt(nums1[0]);
9        int b=Integer.parseInt(nums1[1].replace("i",""));
10        int c=Integer.parseInt(nums2[0]);
11        int d=Integer.parseInt(nums2[1].replace("i",""));
12
13        int e=a*c;
14        int f=b*d;
15        int g=(a*d)+(b*c);
16        int h=e-f;
17
18        s.append(h);
19        s.append("+");
20        s.append(g);
21        s.append("i");
22        return s.toString();
23    }
24}