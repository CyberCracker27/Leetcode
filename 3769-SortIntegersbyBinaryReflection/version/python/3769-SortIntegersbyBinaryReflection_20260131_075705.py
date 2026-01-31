# Last updated: 31/01/2026, 07:57:05
1class Solution(object):
2    def removeZeros(self, n):
3        x=""
4        s=str(n)
5        for i in range(len(s)):
6            if s[i]!='0':
7                x+=s[i]
8        return int(x)
9        