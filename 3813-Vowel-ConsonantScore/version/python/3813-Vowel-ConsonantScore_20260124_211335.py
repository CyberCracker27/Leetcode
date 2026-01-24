# Last updated: 24/01/2026, 21:13:35
1class Solution(object):
2    def vowelConsonantScore(self, s):
3        c=0
4        v=0
5        for i in s:
6            if i in "aeiou":
7                v+=1
8            elif i.isalpha():
9                c+=1
10        if c==0:
11            return 0
12        else :
13            return v//c