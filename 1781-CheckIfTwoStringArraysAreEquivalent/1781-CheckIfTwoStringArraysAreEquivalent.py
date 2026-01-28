# Last updated: 28/01/2026, 08:10:13
class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        str1="".join(word1)
        str2="".join(word2)
        if str1==str2:
            return True
        else:
            return False
        