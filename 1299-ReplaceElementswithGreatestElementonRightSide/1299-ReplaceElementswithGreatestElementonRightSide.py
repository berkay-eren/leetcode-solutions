# Last updated: 10/12/2025, 22:00:23
1class Solution:
2    def replaceElements(self, arr: List[int]) -> List[int]:
3        rightMax = -1
4
5        for i in range(len(arr) - 1, -1, -1):
6            newMax = max(rightMax,arr[i])
7            arr[i] = rightMax
8            rightMax = newMax
9
10        return arr
11        