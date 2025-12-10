# Last updated: 10/12/2025, 20:43:41
1class Solution:
2    def scoreOfString(self, s: str) -> int:
3        score = 0
4
5        for i in range(len(s) - 1):
6            score += abs(ord(s[i]) - ord(s[i+1]))
7
8        return score