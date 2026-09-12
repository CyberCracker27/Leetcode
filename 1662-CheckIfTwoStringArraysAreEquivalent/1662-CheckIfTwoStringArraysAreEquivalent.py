# Last updated: 9/12/2026, 7:31:47 AM
class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        str1="".join(word1)
        str2="".join(word2)
        if str1==str2:
            return True
        else:
            return False
        