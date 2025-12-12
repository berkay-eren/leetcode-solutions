# Last updated: 12/12/2025, 17:48:48
1class Solution:
2    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
3        count = 0
4        max_count = 0
5
6        for num in nums:
7            if num == 1:
8                count += 1
9                max_count = max(max_count, count)
10            else:
11                count = 0
12
13        return max_count
14