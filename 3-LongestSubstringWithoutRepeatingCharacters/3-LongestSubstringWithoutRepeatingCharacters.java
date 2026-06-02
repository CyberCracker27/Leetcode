// Last updated: 6/2/2026, 11:31:24 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n=s.length();
4        int max=0;
5        Set<Character> len=new HashSet<>();
6        int left=0;
7        for(int right=0;right<n;right++){
8            if(!len.contains(s.charAt(right))){
9                len.add(s.charAt(right));
10                max=Math.max(max,right-left+1);
11            }else{
12                while(len.contains(s.charAt(right))){
13                    len.remove(s.charAt(left));
14                    left++;
15                }
16                len.add(s.charAt(right));
17            }
18        }
19        return max;
20    }
21}