# Last updated: 9/12/2026, 7:17:57 AM
class Solution(object):
    def vowelConsonantScore(self, s):
        c=0
        v=0
        for i in s:
            if i in "aeiou":
                v+=1
            elif i.isalpha():
                c+=1
        if c==0:
            return 0
        else :
            return v//c