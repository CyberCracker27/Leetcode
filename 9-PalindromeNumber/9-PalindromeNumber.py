# Last updated: 21/01/2026, 22:11:34
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        a=str(x)
        revers=a[::-1]
        return a==revers