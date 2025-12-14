# Last updated: 14/12/2025, 21:09:06
1class Solution:
2    def stringMatching(self, words: List[str]) -> List[str]:
3        res = []
4        for i in range(len(words)):
5            for j in range(len(words)):
6                if i == j:
7                    continue
8
9                if words[i] in words[j]:
10                    res.append(words[i])
11                    break    
12
13        return res