# Last updated: 22/11/2025, 16:54:42
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = 1

        for right in range(1,len(nums)):
            if nums[right] != nums[right - 1]:
                nums[left] = nums[right]
                left += 1
        
        return left