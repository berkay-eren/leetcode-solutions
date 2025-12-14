# Last updated: 14/12/2025, 21:47:06
1class Solution:
2    def numUniqueEmails(self, emails: List[str]) -> int:
3        unique = set()
4
5        for e in emails:
6            i, localName = 0, ""
7            
8            while e[i] not in ["@", "+"]:
9                if e[i] != ".":
10                    localName += e[i]
11                i += 1
12            
13            while e[i] != "@":
14                i += 1
15            
16            domainName = e[i+1:]
17
18            unique.add((localName,domainName))
19
20        return len(unique) 