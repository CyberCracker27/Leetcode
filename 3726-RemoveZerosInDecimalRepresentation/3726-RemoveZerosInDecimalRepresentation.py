# Last updated: 9/12/2026, 7:18:58 AM
class Solution(object):
    def removeZeros(self, n):
        x=""
        s=str(n)
        for i in range(len(s)):
            if s[i]!='0':
                x+=s[i]
        return int(x)
        