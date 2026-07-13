// Last updated: 7/13/2026, 6:50:49 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> li=new ArrayList<>();
4        String s="123456789";
5        String l=String.valueOf(low);
6        String h=String.valueOf(high);
7        for(int len=l.length();len<=h.length();len++){
8            for(int start=0;start<=9-len;start++){
9                int a=Integer.parseInt(s.substring(start,start + len));
10                    if(a>=low && a<=high){
11                        li.add(a);
12                    }
13            }
14        }
15        return li;
16    }
17}