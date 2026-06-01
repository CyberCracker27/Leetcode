// Last updated: 6/1/2026, 7:08:10 AM
1class Solution {
2    public int numDifferentIntegers(String word) {
3        Set<String> count=new HashSet<>();
4        int start =0;
5        int len=word.length();
6        while(start<len){
7            if(!Character.isDigit(word.charAt(start))){
8                start++;
9                continue;
10            }
11            int end=start;
12            while(end<len && Character.isDigit(word.charAt(end))){
13                end++;
14            }
15            while(start<end && word.charAt(start)=='0'){
16                start++;
17            }
18            count.add(word.substring(start,end));
19            start=end;
20        }
21        return count.size();
22    }
23}