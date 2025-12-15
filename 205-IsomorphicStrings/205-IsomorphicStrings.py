# Last updated: 15/12/2025, 15:45:32
1class Solution:
2    def isIsomorphic(self, s: str, t: str) -> bool:
3        mapST, mapTS = {}, {}
4        
5        for i in range(len(s)):
6            ch1, ch2 = s[i], t[i]
7
8            if ((ch1 in mapST and mapST[ch1] != ch2) or 
9                (ch2 in mapTS and mapTS[ch2] != ch1)):
10                return False
11
12            mapST[ch1] = ch2
13            mapTS[ch2] = ch1 
14        return True