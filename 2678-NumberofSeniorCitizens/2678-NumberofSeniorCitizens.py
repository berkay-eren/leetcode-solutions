# Last updated: 12/12/2025, 17:39:53
1class Solution:
2    def countSeniors(self, details: List[str]) -> int:
3        count = 0
4        for i in range(len(details)):
5            age = int(details[i][11]) * 10 + int(details[i][12])
6            if age > 60:
7                count += 1
8            age = 0
9        return count