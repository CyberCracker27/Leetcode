# Last updated: 31/01/2026, 07:57:39
class Solution(object):
    def removeZeros(self, n):
        x=""
        s=str(n)
        for i in range(len(s)):
            if s[i]!='0':
                x+=s[i]
        return int(x)
        