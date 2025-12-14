# Last updated: 14/12/2025, 22:51:00
1class Solution:
2    def generate(self, numRows: int) -> List[List[int]]:
3        if numRows == 0:
4            return []
5            
6        res = [[1]]
7
8        for i in range(numRows - 1):
9            temp = [0] + res[-1] + [0]
10            nextRow = []
11            for j in range(len(res[-1]) + 1):
12                nextRow.append(temp[j] + temp[j+1])
13            res.append(nextRow)
14
15        return res